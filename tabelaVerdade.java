public class tabelaVerdade
{
    public static void main(String[] args)
    {
        boolean[] A = {true, true, false, false};
        boolean[] B = {true, false, true, false};

        String formato = "%s %-5s %s %-5s %s %-5s %s %-5s %s %-5s %s %-5s %s %-8s %s %-8s %s%n";

        System.out.printf(formato,"|", "A", "|", "B", "|", "~A", "|", "~B", "|", "A ^ B", "|", "A v B", "|", "~(A ^ B)", "|", "~(A v B)", "|");

        System.out.println("-".repeat(71));

        for(int i =0; i<A.length; i++)
        {
            System.out.printf(formato, "|", A[i], "|", B[i], "|", !A[i], "|", !B[i], "|", A[i] && B[i], "|", A[i] || B[i], "|" , !(A[i] && B[i]), "|", !(A[i] || B[i]), "|");
        }

    }
}
