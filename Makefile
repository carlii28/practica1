fichJar = pi.jar

limpiar:
	rm -f $(fichJar)
	rm -rf bin

compilar: limpiar
	mkdir bin
	find src -name "*.java" | xargs javac -cp bin -d bin

jar: compilar
	jar cvfm $(fichJar) Manifest.txt -C bin .

ejecutar: jar
	java -jar $(fichJar)

all: jar
