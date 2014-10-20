MAKE = make

all: Pollock.jar

Pollock.jar: Pollock.java
	cd src/cleaner; $(MAKE)
	cd src/synth; $(MAKE)
	cd src/gateKeeper; $(MAKE)

clean:
	cd src/cleaner; $(MAKE) clean
	cd src/synth; $(MAKE) clean
#going to have to download and install some ruby crap
	
