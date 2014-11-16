package com.pukhova;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * This is the main class from our project, 
 * from which we can instantiate new tracks and disks to deal with
*/

public class Main {

	public static void main(String[] args) {

		Track t1 = new Track("dg", "fg", "fg", "fg", 95);
		Track t2 = new Track("dgd", "ffg", "ffghg", "ghfg", 50);
		Track t3 = new Track("hkdg", "fhjg", "fghfg", "hfg", 507);
		Track t4 = new Track("dyug", "fgwer", "fdrfg", "fgff", 307);
		Track t5 = new Track("retdg", "fgrwt", "fgr", "kfg", 278);
		Track t6 = new Track("retdg", "fgrwt", "fgr", "zfg", 28);
		
		Disk d1 = new Disk();
		d1.writeDisk(t2);
		d1.writeDisk(t5);
		d1.writeDisk(t3);
		d1.writeDisk(t6);
		
		Disk d2 = new Disk();
		Collection<Track> col = new HashSet<Track>();
		col.add(t6);
		col.add(t5);
		col.add(t2);
		d2.writeDisk(col);
		
		Disk d3 = new Disk();
		d3.writeDisk(Arrays.asList(t6, t1, t4));

		System.out.println(d1);
		System.out.println(d1.countTotalDuration());
		System.out.println(d1.sortByStyle());
		System.out.println(d2);
		System.out.println(d2.countTotalDuration());
		System.out.println(d2.sortByStyle());
		System.out.println(d1.searchByDuration(10, 300));

	}

}
