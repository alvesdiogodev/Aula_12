import static java.lang.IO.*;


void main() {

    int i = 1, soma = 0;
    do {
        if (i % 2 ==0) {
            soma += i;
        }
        i++;
        } while (i <=50);
    print ("soma = "+soma);
    
}