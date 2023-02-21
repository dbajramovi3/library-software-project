package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.dao.MemberDaoImpl;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MemberManagerTest {
    private MemberDaoImpl memberDaoImplMock = mock(MemberDaoImpl.class);
    @Test
    void add() throws LibraryException {
        Member member = new Member();
        member.setId(1);
        member.setName("Sergio");
        member.setLast_name("LLull");
        member.setEmail("Llull@gmail.com");

        MockedStatic<DaoFactory> mockedFactory = Mockito.mockStatic(DaoFactory.class);
        mockedFactory.when(DaoFactory::membersDao).thenReturn(memberDaoImplMock);
        Member expected = new Member();
        when(memberDaoImplMock.add(Mockito.any(Member.class))).thenReturn(expected);
        Member actual = memberDaoImplMock.add(new Member());
        assertEquals(expected, actual);
        mockedFactory.close();
    }

}