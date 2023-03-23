class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (1000 < this.salary) {
           tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        int shiftHour = 40;
        if (shiftHour < this.workHours) {
            bonus = (this.workHours - shiftHour) * 30;
        }
        return bonus;
    }

   public double raiseSalary() {
        double raise = 0;
        int currentYear = 2021;
        int yearWorked = currentYear - this.hireYear;
        if (yearWorked < 10) {
            raise = (this.salary * 0.05);
        }
        if (yearWorked < 20) {
            raise = (this.salary * 0.10);
        }
        if (19 < yearWorked) {
            raise = (this.salary * 0.15);
        }
        return raise;
    }

    public String toString() {
        return "\nÇalışanın İsmi : "+this.name+
                "\nMaaşı : "+this.salary+
                "\nÇalışma Saati : "+this.workHours+
                "\nİşe Başlama Yılı : "+this.hireYear+
                "\n==========\nVergi Kesintisi : "+tax()+
                "\nMesai Bonusu : "+bonus()+
                "\nŞirketteki Yılı Bonusu : "+raiseSalary()+
                "\n==========\nBonuslar ve Vergiler Kesintisi Sonrası Maaş : "+(this.salary-tax()+bonus()+raiseSalary());
    }
}
