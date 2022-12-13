package refactoring.chapter08.s09_replcase_magic_number_with_symbolic_constant;

public class foo {
    double potentialEnergy(double mass, double height) {
        return mass * 9.81 * height;
    }

    static final double GRAVITATIONAL_CONSTANT = 9.81;

    double potentialEnergyRefactored(double mass, double height) {
        return mass * GRAVITATIONAL_CONSTANT * height;
    }
}
