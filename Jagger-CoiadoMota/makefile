
Jagger.class: Jagger.java
	javac Jagger.java

Jagger.java: Jagger.jj
	javacc Jagger.jj

check: Check.java
	javac Check.java

clean:
	$(RM) *.class
	$(RM) ast/*.class
	$(RM) ParseException.java Jagger.java TokenMgrError.java SimpleCharStream.java JaggerTokenManager.java JaggerConstants.java Token.java

.PHONY: clean check
