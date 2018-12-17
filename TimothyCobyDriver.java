import java.util.Scanner;

public class TimothyCobyDriver{

  public static void main(String[] args) {

    System.out.println("MAIN MENU:");
    System.out.println("[1] STANDARD");
    System.out.println("[2] DEBUGGER");
    System.out.println("[3] QUIT\n");

    Scanner sc = new Scanner(System.in);
    System.out.print("input: ");

    int input = sc.nextInt();

    switch(input) {
      case 1:
        // construct new, empty LinkedList
        System.out.println("\nMyLinkedList test_case = new MyLinkedList();");
        MyLinkedList test_case = new MyLinkedList();

        // continue
        System.out.println("[.]+[ENTER] to run diagnostics");
        String cont = sc.next();

        // LinkedList constructor diagnostics
        // check initial size()
        System.out.print("// ");
        if(test_case.size() == 0) {
          System.out.println("PASS");
          System.out.println("   test_case.size() == 0");
        } else {
          System.out.println("FAIL");
          System.out.println("   test_case.size() != 0");
        }

        // check toString() against expected
        System.out.print("// ");
        if(test_case.toString().equals("[]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("   expected: []");
        System.out.println("   actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test add(Integer value)");
        cont = sc.next();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(1)");
        System.out.println("test_case.add(2)");
        test_case.add(1);
        test_case.add(2);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 2) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 2");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 2");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test add(Integer value)");
        cont = sc.next();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(-4)");
        System.out.println("test_case.add(-7)");
        test_case.add(-4);
        test_case.add(-7);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 4) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 4");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 4");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -4, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -4, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) values to test_case
        System.out.println("test_case.add(3, -9)");
        test_case.add(3, -9);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 5) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 5");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 5");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) values to test_case
        System.out.println("test_case.add(0, -5)");
        test_case.add(0, -5);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test negative EXCEPTIONS add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) EXCEPTIONS values to test_case
        System.out.println("test_case.add(-1, 10)");

        try {
          test_case.add(-1, 10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test overflow EXCEPTIONS add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) EXCEPTIONS values to test_case
        System.out.println("test_case.add(7, 10)");

        try {
          test_case.add(7, 10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test get(Index)");
        cont = sc.next();

        // get(int index) values from test_case
        System.out.println("test_case.get(0)");

        System.out.print("// ");
        if(test_case.get(0) == -5) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -5");
        System.out.println("  actual:   " + test_case.get(0));

        System.out.println();
        System.out.println("test_case.get(0)");

        System.out.print("// ");
        if(test_case.get(5) == -7) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -7");
        System.out.println("  actual:   " + test_case.get(5));

        System.out.println();
        System.out.println("test_case.get(0)");

        System.out.print("// ");
        if(test_case.get(4) == -9) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -9");
        System.out.println("  actual:   " + test_case.get(4));

        // continue
        System.out.println("\n[.]+[ENTER] to test negative EXCEPTIONS get(int index)");
        cont = sc.next();

        try {
          test_case.get(-1);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to test overflow EXCEPTIONS get(int index)");
        cont = sc.next();

        try {
          test_case.get(7);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION: given index exceeds bounds, overflow EXCEPTION");
        }

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test set(int index, Integer value)");
        cont = sc.next();

        // set(int index, Integer value) values in test_case
        System.out.println("test_case.set(0, -4)");

        Integer t = test_case.set(0, -4);

        System.out.print("// ");
        if(t.equals(-5)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -5");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.set(1, 0)");

        t = test_case.set(1, 0);

        System.out.print("// ");
        if(t.equals(1)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 1");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.set(5, -9)");

        t = test_case.set(5, -9);

        System.out.print("// ");
        if(t.equals(-7)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -7");
        System.out.println("  actual:   " + t);

        // continue
        System.out.println("\n[.]+[ENTER] to test negative EXCEPTIONS set(int index, Integer value)");
        cont = sc.next();

        try {
          test_case.set(-1, 0);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to test overflow EXCEPTIONS get(int index)");
        cont = sc.next();

        try {
          test_case.set(7, 0);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION: given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList set(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-4, 0, 2, -4, -9, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-4, 0, 2, -4, -9, -9]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test contains(Integer value)");
        cont = sc.next();

        // set(int index, Integer value) values in test_case
        System.out.println("test_case.contains(-4)");

        boolean inclusive = test_case.contains(-4);

        System.out.print("// ");
        if(inclusive) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: true");
        System.out.println("  actual:   " + inclusive);

        System.out.println();
        System.out.println("test_case.contains(-9)");

        inclusive = test_case.contains(-9);

        System.out.print("// ");
        if(inclusive) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: true");
        System.out.println("  actual:   " + inclusive);

        System.out.println();
        System.out.println("test_case.contains(2)");

        inclusive = test_case.contains(2);

        System.out.print("// ");
        if(inclusive) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: true");
        System.out.println("  actual:   " + inclusive);

        System.out.println();
        System.out.println("test_case.contains(14)");

        inclusive = test_case.contains(14);

        System.out.print("// ");
        if(!(inclusive)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: false");
        System.out.println("  actual:   " + inclusive);

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test indexOf(Integer value)");
        cont = sc.next();

        // indexOf(Integer value) values in test_case
        System.out.println("test_case.indexOf(-4)");

        t = test_case.indexOf(-4);

        System.out.print("// ");
        if(t == 0) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 0");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.indexOf(-9)");

        t = test_case.indexOf(-9);

        System.out.print("// ");
        if(t == 4) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 4");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.contains(2)");

        t = test_case.indexOf(2);

        System.out.print("// ");
        if(t == 2) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 2");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.indexOf(14)");

        t = test_case.indexOf(14);

        System.out.print("// ");
        if(t == -1) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -1");
        System.out.println("  actual:   " + t);

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test remove(int index)");
        cont = sc.next();

        // remove(int index) values from test_case
        System.out.println("test_case.remove(2)");

        Integer pop = test_case.remove(2);

        System.out.print("// ");
        if(pop.equals(2)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 2");
        System.out.println("  actual:   " + pop);

        System.out.println();
        System.out.println("test_case.remove(2)");

        pop = test_case.remove(2);

        System.out.print("// ");
        if(pop.equals(-4)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -4");
        System.out.println("  actual:   " + pop);

        System.out.println();
        System.out.println("test_case.remove(0)");

        pop = test_case.remove(0);

        System.out.print("// ");
        if(pop.equals(-4)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -4");
        System.out.println("  actual:   " + pop);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList remove(int index) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 3) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 3");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 3");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, -9]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test negative EXCEPTIONS remove(int index)");
        cont = sc.next();

        try {
          test_case.remove(-1);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to test overflow EXCEPTIONS remove(int index)");
        cont = sc.next();

        try {
          test_case.remove(7);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION: given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList remove(int index) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 3) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 3");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 3");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, -9]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // ?

        break;
      case 2:
        // ?
        break;
      case 3:
        System.out.println("How could you leave me like this");
        System.exit(0);
        break;
      default:
        // ?
    }
  }
}
