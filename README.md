# library-software-project
Funkcionalan projekat koji pomaže prilikom rezervisanja knjiga odgovarajućim korisnicima.
Projekat se sastoji od početne stranice gdje administrator unosi ime knjige i email membera.
Ukoliko postoji knjiga i member, knjiga će biti rezervisana, a ukoliko ne postoji izbacit će Alert Error.
Administrator naravno ima mogućnost dodavanja knjige i membera.
Prilikom dodavanja knjige, administrator unosi podatke: title, author i book count.
Prilikom dodavanja membera, administrator unosi podatke: name, last name i email.
Nakon što se rezerviše knjiga boot count se smanjuje za 1.
Ako je administrator rezervisao posljednju knjigu, ta knjiga se briše iz baze podataka.
Također postoji opcija da se pogledaju sve knjige, kao i svi memberi koji su uneseni.
Administrator ima mogućnost pretraživanja knjige i pretraživanja membera koristeći search book i search member.
Ukoliko ime knjige postoji u bazi, klikom na dugme crvena labela će ispisati da postoji, 
a ukoliko ne postoji knjiga, klikom na dugme pojavit će se crvena labela koja će ispisati da ne postoji knjiga u bazi.
Isto vrijedi za membera gdje se provjerava da li postoji njegovo ime u bazi podataka.
