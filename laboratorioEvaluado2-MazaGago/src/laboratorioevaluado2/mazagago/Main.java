/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioevaluado2.mazagago;

/**
 *
 * @author hecto
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Medicamento> medicamentos = new ArrayList();
        //Medicamentos precargados refrigerados
        medicamentos.add(new MedicamentosRefrigerados(1, "Vacuna COVID-19", 25.50, 150, 12, 24, 1, 0, 2.0, 8.0, 5.0, 12));
        medicamentos.add(new MedicamentosRefrigerados(2, "Insulina", 40.75, 200, 5, 25, 2, 0, 2.0, 8.0, 4.0, 10));
        medicamentos.add(new MedicamentosRefrigerados(3, "Vacuna Hepatitis B", 30.00, 4, 9, 23, 3, 0, 2.0, 8.0, 3.0, 15));
        medicamentos.add(new MedicamentosRefrigerados(4, "Antibiótico inyectable", 15.80, 80, 11, 23, 4, 0, 2.0, 8.0, 6.0, 8));
        medicamentos.add(new MedicamentosRefrigerados(5, "Hormona de crecimiento", 75.60, 50, 3, 26, 5, 0, 2.0, 8.0, 5.5, 14));
        medicamentos.add(new MedicamentosRefrigerados(6, "Vacuna Influenza", 22.30, 180, 7, 24, 6, 0, 2.0, 8.0, 4.5, 9));
        medicamentos.add(new MedicamentosRefrigerados(7, "Factor VIII", 150.00, 3, 4, 25, 7, 0, 2.0, 8.0, 2.5, 6));
        medicamentos.add(new MedicamentosRefrigerados(8, "Toxina botulínica", 120.75, 25, 10, 23, 8, 0, 2.0, 8.0, 3.8, 5));
        medicamentos.add(new MedicamentosRefrigerados(9, "Vacuna Tétanos", 18.90, 170, 2, 24, 9, 0, 2.0, 8.0, 4.2, 7));
        medicamentos.add(new MedicamentosRefrigerados(10, "Inmunoglobulina", 200.50, 60, 6, 25, 10, 0, 2.0, 8.0, 3.3, 12));
        //Medicamentos precargados ambiente
        medicamentos.add(new MedicamentosAmbiente(11, "Paracetamol", 5.50, 300, 12, 24, 11, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(12, "Ibuprofeno", 7.75, 250, 5, 25, 12, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(13, "Amoxicilina", 12.00, 150, 9, 23, 13, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(14, "Loratadina", 4.80, 500, 11, 23, 14, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(15, "Vitamina C", 3.60, 2, 3, 26, 15, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(16, "Omeprazol", 10.30, 350, 7, 24, 16, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(17, "Ácido fólico", 6.50, 180, 4, 25, 17, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(18, "Diclofenaco", 9.75, 220, 10, 23, 18, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(19, "Metformina", 8.90, 4, 2, 24, 19, 0, 25.0));
        medicamentos.add(new MedicamentosAmbiente(20, "Losartán", 14.50, 320, 6, 25, 20, 0, 25.0));


        boolean salir = false;
        int opcion;

        Scanner datos = new Scanner (System.in);

        while (!salir) {

            System.out.println("1. Agregar medicamentos");
            System.out.println("2. Mostrar precios de venta y aplicar ofertas");
            System.out.println("3. Mostrar medicamentos vencidos");
            System.out.println("4. Retirar lote");
            System.out.println("5. Chequear inventario");
            System.out.println("6. Mostrar informacion de todos los medicamentos");
            System.out.println("7. Realizar orden");
            System.out.println("8. Salir");

            try {

                System.out.println("Indica una opcion: ");
                opcion = datos.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Indique el id del nuevo medicamento: ");
                        int id = datos.nextInt();
                        System.out.println("Ingrese el nombre del nuevo medicamento: ");
                        String nombre = datos.next();
                        System.out.println("Ingrese el costo del nuevo medicamento: ");
                        double costo = datos.nextDouble();
                        System.out.println("Ingrese las unidades existentes: ");
                        int unidadesE = datos.nextInt();
                        System.out.println("Indique el mes de vencimiento (1-12): ");
                        int mesV = datos.nextInt();
                        System.out.println("Indique el ano de vencimiento (21, 22, 23 ...): ");
                        int anoV = datos.nextInt();
                        System.out.println("Indique el numero de lote del nuevo medicamento: ");
                        int lote = datos.nextInt();
                        System.out.println("Indique la vigencia del nuevo medicamento (0: x, 1: x, 2: x): ");
                        int vigencia = datos.nextInt();
                        System.out.println("Indique la temperatura de almacenamiento del nuevo medicamento (C): ");
                        double temperatura = datos.nextDouble();
                        //determinar si es temperatura ambiente o refrigerado
                        if(temperatura < 15) {
                            System.out.println("Indique la temperatura minima del medicamento refrigerado (C): ");
                            double tempMin = datos.nextDouble();
                            System.out.println("Indique la tempertura maxima del medicamento refrigerado (C): ");
                            double tempMax = datos.nextDouble();
                            System.out.println("Indique el tiempo maximo sin refrigeracion del medicamento refrigerado (hrs): ");
                            double tiempoMax = datos.nextDouble();
                            //Nuevo medicamento refrigerado
                            MedicamentosRefrigerados nuevoMed = new MedicamentosRefrigerados(id, nombre, costo, unidadesE, mesV, anoV, lote, vigencia, tempMin, tempMax, temperatura, tiempoMax);
                            //Agregar nuevo medicamento refrigerado a la lista de medicamentos
                            medicamentos.add(nuevoMed);
                        } else if (temperatura >= 15 && temperatura <= 25) {
                            //Nuevo medicamento ambiente
                            MedicamentosAmbiente nuevoMed = new MedicamentosAmbiente(id, nombre, costo, unidadesE, mesV, anoV, lote, vigencia, temperatura);
                            //Agregar nuevo medicamento ambiente a la lista de refrigerados
                            medicamentos.add(nuevoMed);
                        } else {
                            System.out.println("La temperatura ingresada no es valida");
                            break;
                        }

                        break;
                    case 2:
                        System.out.println("Indique el mes actual (01-12): ");
                        int mesO = datos.nextInt();
                        System.out.println("Indique el ano actual (24-25 ...): ");
                        int anoO = datos.nextInt();
                        for (int i = 0; i < medicamentos.size(); i++) {
                            System.out.println();
                            medicamentos.get(i).colocarOferta(mesO, anoO);
                            System.out.println("Nombre: " + medicamentos.get(i).getNombre() + " -> Precio de venta: " + medicamentos.get(i).getPrecioVenta());
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Indique el mes actual (01-12): ");
                        int mesA = datos.nextInt();
                        System.out.println("Indique el ano actual (24-25 ...): ");
                        int anoA = datos.nextInt();
                        for (int i = 0; i < medicamentos.size(); i++) {
                            System.out.println();
                            medicamentos.get(i).determinarVencido(mesA, anoA);
                        }
                        break;
                    case 4:
                        System.out.println("Indique el numero de lote que desea retirar (00001-...)");
                        int loteR = datos.nextInt();
                        for(int i = 0; i < medicamentos.size(); i++) {
                            medicamentos.get(i).retirarLote(loteR);
                        }
                        break;
                    case 5:
                        //med1.reponerInventario();
                        for (int i = 0; i < medicamentos.size(); i++) {
                            medicamentos.get(i).reponerInventario();
                        }
                        break;
                    case 6:
                        for (int i = 0; i < medicamentos.size(); i++) {
                            medicamentos.get(i).mostrarInformacion();
                        }
                        System.out.println();
                        break;
                    case 7:
                        ArrayList<Medicamento> pedido = new ArrayList<>();
                        boolean salirDos = false;
                        while (!salirDos) {
                            System.out.println("1. Agregar medicamentos al pedido");
                            System.out.println("2. Eliminar alimentos del pedido");
                            System.out.println("3. Finalizar pedido");
                            System.out.println("4. Cancelar pedido");

                            try {

                                System.out.println("Indica una opcion: ");
                                opcion = datos.nextInt();

                                switch (opcion) {
                                    case 1:
                                        System.out.println();
                                        for (int i = 0; i < medicamentos.size(); i++) {
                                            if (medicamentos.get(i).getVigencia() == 0) {
                                                System.out.println("Id: " + medicamentos.get(i).getId() + ", nombre: " + medicamentos.get(i).getNombre() + " -> Precio de venta: " + medicamentos.get(i).getPrecioVenta());
                                                System.out.println();
                                            }
                                        }

                                        System.out.println("Indique el id del medicamento que desea agregar al pedido: ");
                                        int idMedAdd = datos.nextInt();
                                        for (int i = 0; i < medicamentos.size(); i++) {
                                            if (medicamentos.get(i).getId() == idMedAdd) {
                                                pedido.add(medicamentos.get(i));
                                                System.out.println("Medicamento agregado al pedido!");
                                                System.out.println();
                                                System.out.println("El pedido actual es: ");
                                                for (int x = 0; x < pedido.size(); x++) {
                                                    System.out.println((x+1) + ". Nombre: " + pedido.get(x).getNombre() + " -> Precio de venta: " + pedido.get(x).getPrecioVenta());
                                                    System.out.println();
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println();
                                        for (int i = 0; i < pedido.size(); i++) {
                                            if (pedido.get(i).getVigencia() == 0) {
                                                System.out.println("Id: " + pedido.get(i).getId() + ", nombre: " + pedido.get(i).getNombre() + " -> Precio de venta: " + pedido.get(i).getPrecioVenta());
                                                System.out.println();
                                            }
                                        }
                                        System.out.println("Indique el id del medicamento que desea eliminar del pedido: ");
                                        int idMedDel = datos.nextInt();
                                        for (int i = 0; i < pedido.size(); i++ ) {
                                            if (pedido.get(i).getId() == idMedDel) {
                                                pedido.remove(i);
                                                System.out.println("Medicamento eliminado del pedido!");
                                                for (int x = 0; x < pedido.size(); x++) {
                                                    System.out.println((x+1) + ". Nombre: " + pedido.get(x).getNombre() + " -> Precio de venta: " + pedido.get(x).getPrecioVenta());
                                                    System.out.println();
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.println();
                                        System.out.println("Su pedido es: ");
                                        for (int x = 0; x < pedido.size(); x++) {
                                            System.out.println((x+1) + ". Nombre: " + pedido.get(x).getNombre() + " -> Precio de venta: " + pedido.get(x).getPrecioVenta());
                                            System.out.println();
                                        }
                                        System.out.println("-------------------------------------------------");
                                        int total = 0;
                                        for (int i = 0; i < pedido.size(); i++) {
                                            total += pedido.get(i).getPrecioVenta();
                                        }
                                        System.out.println("Total: " + total);
                                        System.out.println();
                                        System.out.println("Desea culminar la orden? (y/n): ");
                                        String decision = datos.next();
                                        if (decision.equals("y")) {
                                            for (int i = 0; i < pedido.size(); i++) {
                                                for (int j = 0; j < medicamentos
                                                        .size(); j++) {
                                                    if (pedido.get(i).getId() == medicamentos.get(j).getId()) {
                                                        medicamentos.get(j).setUnidadesExistentes(medicamentos.get(j).getUnidadesExistentes() - 1);
                                                        medicamentos.get(j).setUnidadesVendidas(medicamentos.get(j).getUnidadesVendidas() + 1);
                                                    }
                                                }
                                            }
                                            salirDos = true;
                                            break;
                                        } else if (decision.equals("n")) {
                                            salirDos = true;
                                            break;
                                        }
                                        break;
                                    case 4:
                                        salirDos = true;
                                        break;
                                    default:
                                        System.out.println("Solo numeros entre 1 y ");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un numero");
                                datos.next();
                            }
                        }
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                datos.next();
            }
        }
    }
}
