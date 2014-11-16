package test.com.pukhova;

/**
 * This class is going to cover our project with tests
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.pukhova.Disk;
import com.pukhova.Track;

public class DiskTest {

	@Test
	public void testWriteDisk(){
		Track t1 = new Track("dg", "fg", "fg", "fg", 95);
		Disk d1 = new Disk();
		d1.writeDisk(t1);
		d1.writeDisk(t1);
		Assert.assertEquals(1, d1.getTracksCount());
	}

	@Test
	public void testCountTotalDuration(){
		Track t1 = new Track("dg", "fg", "fg", "fg", 95);
		Track t2 = new Track("dgd", "ffg", "ffghg", "ghfg", 50);
		Disk d1 = new Disk();
		d1.writeDisk(Arrays.asList(t1, t2));
		Assert.assertEquals(145, d1.countTotalDuration());
	}

	@Test
	public void testSortByStyle(){
		Track t1 = new Track("retdg", "fgrwt", "fgr", "kfg", 278);
		Track t2 = new Track("retdg", "fgrwt", "fgr", "zfg", 28);
		Track t3 = new Track("dyug", "fgwer", "fdrfg", "fgff", 307);
		Disk d1 = new Disk();
		d1.writeDisk(Arrays.asList(t1, t2, t3));
		Set<Track> expected = new LinkedHashSet<Track>(Arrays.asList(t3, t1, t2));
		Iterator<Track> it = d1.sortByStyle().iterator(); 
		for (Track t : expected){
			Assert.assertEquals(t, it.next());
		}
	}

	@Test
	public void testSearchByDuration(){
		Track t1 = new Track("dyug", "fgwer", "fdrfg", "fgff", 307);
		Track t2 = new Track("retdg", "fgrwt", "fgr", "kfg", 278);
		Track t3 = new Track("retdg", "fgrwt", "fgr", "zfg", 28);
		Disk d1 = new Disk();
		d1.writeDisk(Arrays.asList(t1, t2, t3));
		Assert.assertTrue(d1.searchByDuration(10, 290).containsAll(Arrays.asList(t2, t3)));
	}

}
