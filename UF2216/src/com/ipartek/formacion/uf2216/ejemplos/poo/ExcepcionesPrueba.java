package com.ipartek.formacion.uf2216.ejemplos.poo;

public class ExcepcionesPrueba {
	public static void main(String[] args) {
		String s = null;
		int[] arr = new int[2];
		System.out.println("Antes");

		try {
			s.toUpperCase();
			arr[2] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error en el acceso al array");
//			e.printStackTrace();
		} catch (NullPointerException n) {
			System.out.println("Has ejecutado un m�todo desde un null");
		} catch (Exception e) {
			System.out.println("Error no esperado");
			return;
		} finally {
			System.out.println("Se ejecuta siempre");
		}
		
		System.out.println("Despu�s");
		System.out.println(arr[1]);

	}
}
