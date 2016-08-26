import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alexandr on 26.08.2016.
 */
public class ManagersTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Managers[] empls = new Managers[0];
        for (int i = 0; i < 3; i++) {
            //создание сотрудника
            Managers empl = new Managers();
            System.out.println("Input name");
            String name = scanner.next();
            empl.setName(name);
            //создание менеджера
            System.out.println("Input manager name");
            Managers manager = new Managers();
            String managerName = scanner.next();
            manager.setName(managerName);

            //связка сотрудника с менеджером

            empl.setManager(manager);
            //выделение памяти - база сотрудников
            empls = Arrays.copyOf(empls, empls.length + 1);
            //внесение нового сотрудника в базу(условно сохранение)
            empls[empls.length - 1] = empl;
        }

        for (Managers empl : empls) {
            System.out.println(empl);
        }

        System.out.println("Input name for search");
        String nameForSearch = scanner.next();
        printAllManagers(nameForSearch,empls);

    }

    public static void printAllManagers(String nameForSearch, Managers[] empls ) {
        for (Managers empl : empls) {
            if (empl.getName().equals(nameForSearch)) {
                System.out.println(empl);
                if (empl.getManager()!= null){
                printAllManagers (empl.getManager().getName(),empls);}
                break;
            }
        }
    }

}
