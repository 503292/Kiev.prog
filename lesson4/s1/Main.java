package lesson4.s1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Notebook notebook = new Notebook("Lenovo", "ThingPad", "I7", "Good");

		USBFlash flashDriveOne = new USBFlash(16, "Apache");
		USBFlash flashDriveTwo = new USBFlash(8, "Apache");
		USBFlash flashDriveThree = new USBFlash(32, "Apache");

		USBMouse mouseOne = new USBMouse("PleoMax", true);

		notebook.connectUSBDevice(flashDriveOne);
		System.out.println("\r");
		notebook.connectUSBDevice(mouseOne);

		USBFlash[] flashDrives = new USBFlash[] { flashDriveOne, flashDriveTwo, flashDriveThree };

		for (USBFlash usbFlashDrives : flashDrives) {
			System.out.println(usbFlashDrives);
		}
		System.out.println();
		
		Arrays.sort(flashDrives);
		
		for (USBFlash usbFlashDrives : flashDrives) {
			System.out.println(usbFlashDrives);
		}
		System.out.println();
	}
}
