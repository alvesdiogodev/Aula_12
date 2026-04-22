import static java.lang.IO.*;

void main() {

    int i = 1, soma= 0;
    do {
        soma += i;
        i++;
    } while (i <= 50);

    println ("Soma = " + soma);
}