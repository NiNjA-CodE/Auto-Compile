// Ronan Ridgway
// Cloud_Compiler

import java.util.*;
import java.io.*;
import java.lang.*;

public class Compiler
{

static String cmd = "";

        static void compileCpp()
        {
                cmd = "./compileCpp.sh";

//	cmd = "g++ -S ./snips/*.cpp &> out.txt ; grep \"error\" out.txt &> final";

                runCommand(cmd);
        }

        static void compileJava()
        {
                cmd = "./compileJava.sh";
	
//	cmd = "javac -implicit:none ./snips/*.java &> out.txt ; grep \"error\" out.txt &> final";

                runCommand(cmd);
        }

        static void compileCcc()
        {
                cmd = "echo This is a CCC test!!";

//	cmd = "gcc -S ./snips/*.c &> out.txt ; grep \"error\" out.txt &> final";


                runCommand(cmd);
        }

        static void noCompile()
        {

                runCommand(cmd);
        }

        static void runCommand(String cmd)
        {

        try{

        System.out.println("Commanding...\n");

//      Process p = Runtime.getRuntime().exec("./compileC.sh");
        Process p = Runtime.getRuntime().exec(cmd);

        System.out.println("Obeyed!\n");

        }catch(Exception e)
        {e.printStackTrace();}

        }

        public static void main(String[] progSpec)
        {

//              String cmd = "./compileC.sh";
         String type = progSpec[0];

	Compiler c = new Compiler();

        if(progSpec != null)
        {
                switch(type)
                {
                        case "C":
				System.out.println("Compiling C!");
                               	c.compileCcc();
                        break;

                        case "CPP":
				System.out.println("Compiling C++!");
                                c.compileCpp();
                        break;

                        case "JAVA":
				System.out.println("Compiling Java!");
                                c.compileJava();
                        break;

                        default:
                                c.runCommand("echo XXX &> echo_out");
                        break;
                }
        }
        }

}

/*





try{
Process p = Runtime.getRuntime().exec(new String[]{"bash","-c","ls -la"});
}
catch(IOException e)
{System.out.println("Ouch!\n");}


---------



         String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("g++ -S code_1.cpp &> out.txt ; grep \"error\" lastout.txt &> final");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}        


*/




