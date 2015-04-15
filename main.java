//
// Capstone testing HiJack in Console-App
//

import NuJack.*;
import java.util.ArrayList;

class main
{  
        public static void main(String args[])
        {

//		ArrayList<Integer> da = new ArrayList<Integer>();
//		da.add(1);
//		da.add(1);
//		da.add(1);
//		da.add(1);
//		da.add(1);
//		deleteAllButLast(da);
//		printLst(da);

//          	System.out.println("------DONE------");
		ArrayList<Integer> data_array = new ArrayList<Integer>();
			data_array.add(948);
			data_array.add(948); 
			data_array.add(922); 
			data_array.add(900); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(850); 
			data_array.add(850); 
			data_array.add(830); 
			data_array.add(850); 
			data_array.add(880); 
			data_array.add(891); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(880); 
			data_array.add(850); 
			data_array.add(830); 
			data_array.add(811); 
			data_array.add(811); 
			data_array.add(810); 
			data_array.add(824); 
			data_array.add(870); 
			data_array.add(860); 
			data_array.add(880); 
			data_array.add(870); 
			data_array.add(860); 
			data_array.add(850); 
			data_array.add(830); 
			data_array.add(810); 
			data_array.add(811); 
			data_array.add(830); 
			data_array.add(860); 
			data_array.add(900); 
			data_array.add(922); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(860); 
			data_array.add(870); 
			data_array.add(900); 
			data_array.add(948); 
			data_array.add(953); 
			data_array.add(943); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(870); 
			data_array.add(870); 
			data_array.add(900); 
			data_array.add(943); 
			data_array.add(948); 
			data_array.add(948); 
			data_array.add(922); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(870); 
			data_array.add(948); 
			data_array.add(715); 
			data_array.add(724); 
			data_array.add(704); 
			data_array.add(948); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(880); 
			data_array.add(880); 
			data_array.add(880); 
			data_array.add(910); 
			data_array.add(922); 
			data_array.add(922); 
			data_array.add(910); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(870); 
			data_array.add(880); 
			data_array.add(900); 
			data_array.add(922); 
			data_array.add(948); 
			data_array.add(920); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(870); 
			data_array.add(850); 
			data_array.add(891); 
			data_array.add(910); 
			data_array.add(943); 
			data_array.add(922); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(860); 
			data_array.add(840); 
			data_array.add(870); 
			data_array.add(900); 
			data_array.add(922); 
			data_array.add(953); 
			data_array.add(943); 
			data_array.add(943); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(910); 
			data_array.add(943); 
			data_array.add(943); 
			data_array.add(930); 
			data_array.add(922); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(922); 
			data_array.add(948); 
			data_array.add(704); 
			data_array.add(953); 
			data_array.add(943); 
			data_array.add(910); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(900); 
			data_array.add(943); 
			data_array.add(922); 
			data_array.add(922); 
			data_array.add(930); 
			data_array.add(948); 
			data_array.add(943); 
			data_array.add(910); 
			data_array.add(891); 
			data_array.add(870); 
			data_array.add(850); 
			data_array.add(830); 
			data_array.add(860); 
			data_array.add(880); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(870); 
			data_array.add(870); 
			data_array.add(850); 
			data_array.add(840); 
			data_array.add(830); 
			data_array.add(840); 
			data_array.add(850); 
			data_array.add(880); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(880); 
			data_array.add(860); 
			data_array.add(860); 
			data_array.add(830); 
			data_array.add(830); 
			data_array.add(840); 
			data_array.add(870); 
			data_array.add(891); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(870); 
			data_array.add(900); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(900); 
			data_array.add(943); 
			data_array.add(704); 
			data_array.add(704); 
			data_array.add(948); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(943); 
			data_array.add(704); 
			data_array.add(724); 
			data_array.add(715); 
			data_array.add(704); 
			data_array.add(953); 
			data_array.add(948); 
			data_array.add(943); 
			data_array.add(900); 
			data_array.add(922); 
			data_array.add(948); 
			data_array.add(953); 
			data_array.add(953); 
			data_array.add(953); 
			data_array.add(943); 
			data_array.add(943); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(948); 
			data_array.add(953); 
			data_array.add(953); 
			data_array.add(948); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(860); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(943); 
			data_array.add(953); 
			data_array.add(704); 
			data_array.add(953); 
			data_array.add(943); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(891); 
			data_array.add(900); 
			data_array.add(922); 
			data_array.add(922); 
			data_array.add(943); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(900); 
			data_array.add(910); 
			data_array.add(948); 
			data_array.add(704); 
			data_array.add(704); 
			data_array.add(948); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(891); 
			data_array.add(870); 
			data_array.add(880); 
			data_array.add(910); 
			data_array.add(943); 
			data_array.add(948); 
			data_array.add(920); 
			data_array.add(910); 
			data_array.add(910); 
			data_array.add(900); 
			data_array.add(860); 
			data_array.add(948); 
			data_array.add(948); 
			data_array.add(948); 
			data_array.add(922); 
			data_array.add(943); 
			data_array.add(943); 
			data_array.add(943); 
			data_array.add(922); 
			data_array.add(943); 
			data_array.add(943); 
			data_array.add(930); 
			data_array.add(910); 
			data_array.add(880); 
			data_array.add(860); 
			data_array.add(830); 
			data_array.add(811); 
			data_array.add(800); 
			data_array.add(800); 
			data_array.add(824); 
			data_array.add(850); 
			data_array.add(880); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(860); 
			data_array.add(840); 
			data_array.add(830); 
			data_array.add(810); 
			data_array.add(800); 
			data_array.add(800); 
			data_array.add(830); 
			data_array.add(860); 
			data_array.add(870); 
			data_array.add(850); 
			data_array.add(824); 
			data_array.add(811); 
			data_array.add(790); 
			data_array.add(800); 
			data_array.add(824); 
			data_array.add(850); 
			data_array.add(860); 
			data_array.add(870); 
			data_array.add(860); 
			data_array.add(830); 
			data_array.add(824); 
			data_array.add(824); 
			data_array.add(830); 
			data_array.add(891); 
			data_array.add(943); 
			data_array.add(948); 
			data_array.add(910); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(891); 
			data_array.add(900); 
			data_array.add(948); 
			data_array.add(948); 
			data_array.add(704); 
			data_array.add(900); 
			data_array.add(860); 
			data_array.add(850); 

/*			data_array.add(9100);
			data_array.add(9080);
			data_array.add(9060);
			data_array.add(9100);
			data_array.add(9140);
			data_array.add(9170);
			data_array.add(9130);
			data_array.add(9110);
			data_array.add(9110);
			data_array.add(9090);
			data_array.add(9100);
			data_array.add(9190);
			data_array.add(9300);
			data_array.add(9360);
			data_array.add(9440);
			data_array.add(9480);
			data_array.add(9570);

			data_array.add(9650);
			data_array.add(9670);
			data_array.add(9700);
			data_array.add(9750);
			data_array.add(9710);
			data_array.add(9670);
			data_array.add(9620);
			data_array.add(9580);
			data_array.add(9580);
			data_array.add(9530);
			data_array.add(9530);
			data_array.add(9530);
			data_array.add(9540);
			data_array.add(9500);
			data_array.add(9530);
			data_array.add(9550);
			data_array.add(9570);
			data_array.add(9580);
			data_array.add(9570);
			data_array.add(9590);
			data_array.add(9630);
			data_array.add(9700);
			data_array.add(9710);
			data_array.add(9720);
			data_array.add(9700);
			data_array.add(9660);
			data_array.add(9620);
			data_array.add(9590);
			data_array.add(9590);
			data_array.add(9550);
			data_array.add(9490);
			data_array.add(9410);
			data_array.add(9400);
			data_array.add(9420);
			data_array.add(9400);
			data_array.add(9400);
			data_array.add(9410);
			data_array.add(9430);
			data_array.add(9400);
			data_array.add(9380);
			data_array.add(9390);
			data_array.add(9390);
			data_array.add(9370);
			data_array.add(9360);
			data_array.add(9360);
			data_array.add(9380);
			data_array.add(9450);
			data_array.add(9460);
			data_array.add(9490);
			data_array.add(9530);
			data_array.add(9510);
			data_array.add(9540);
			data_array.add(9550);
			data_array.add(9570);
			data_array.add(9570);
			data_array.add(9520);
			data_array.add(9460);
			data_array.add(9420);
			data_array.add(9410);
			data_array.add(9380);
			data_array.add(9390);
			data_array.add(9260);
			data_array.add(9220);
			data_array.add(9190);
			data_array.add(9180);
			data_array.add(9180);
			data_array.add(9150);
			data_array.add(9150);
			data_array.add(9130);
			data_array.add(9140);
			data_array.add(9150);
			data_array.add(9180);
			data_array.add(9200);
			data_array.add(9200);
			data_array.add(9210);
			data_array.add(9210);
			data_array.add(9230);
			data_array.add(9240);
			data_array.add(9230);
			data_array.add(9190);
			data_array.add(9140);
			data_array.add(9140);
			data_array.add(9130);
			*/
		ArrayList<Integer> peeks = new ArrayList<Integer>(); 
		ArrayList<Integer> buffer = new ArrayList<Integer>();
		ArrayList<Integer> sample_widths = new ArrayList<Integer>();
		int new_bpm, old_bpm;
		for(int i = 0; i < data_array.size(); i++){

			System.out.printf("Adding element #%d%n", i);
			new_bpm = PeakDetection(data_array.get(i), buffer, peeks);

			if(new_bpm != -1) {
				if(sample_widths.size() == 0) {
					old_bpm = 0;
				} else {
					old_bpm = sample_widths.get(sample_widths.size()-1);
				}
				sample_widths.add(old_bpm+new_bpm);
				//System.out.printf("BEAT INDEX %d%n", old_bpm+new_bpm);

			}
//
		}
//		System.out.printf("Sampel width list is %d%n", sample_widths.size());
        }

	public static int PeakDetection(int data, ArrayList<Integer> buffer, ArrayList<Integer> peeks)
	{
		// here if smaller than size fuck this shit below just add an return
		//
		buffer.add(data);
		//System.out.printf("Adding %d to the buffer%n", data);
		if (buffer.size() < 4) {
			//System.out.printf("Not removing any elements since buffer size = %d%n", buffer.size());
			return -1;
		}


		int prev = buffer.get(buffer.size()-2);
		int second_pre = buffer.get(buffer.size()-3);

		int prev_deriv = prev - second_pre;
		int cur_deriv = data - prev;
		int sample_between_beat;


//		System.out.printf("currrent derive is %d prev deriative is %d%n", cur_deriv, prev_deriv);
		//System.out.printf("DERIVATIVE %d,%n", cur_deriv);
		if ((prev_deriv >= 0 && cur_deriv < 0) || (prev_deriv <= 0 && cur_deriv > 0))
		{
			peeks.add(buffer.get(buffer.size()-2));
			System.out.printf("Adding %d to the peak list, size is now %d%n", buffer.get(buffer.size()-2), peeks.size());
			if(peeks.size() < 3) { 
				//System.out.printf("Returning since peek list is too short%n");
				return -1; 
			}
			if(peeks.size() != 3) {
				peeks.remove(0);
			}
			int psize = peeks.size();
			//System.out.printf("Printing new peak list");
			printLst(peeks);
			
		if((peeks.get(psize-2) > peeks.get(psize-1)) && (peeks.get(psize-2) > peeks.get(psize-3))) {
				// This means the previous peak is a beat
				//System.out.printf("%d is a beat%n", peeks.get(psize-2));
//				System.out.printf("printing buffer of size %d%n", buffer.size());
				printLst(buffer);
				int return_val =0;
				int size = buffer.size();
				int new_beat = peeks.get(psize-2);
				//System.out.printf("Looking for new beat %d%n", new_beat);
				for(int i = 0; i < (size-1); i++) {
					if(buffer.get(i) != new_beat) {
						//System.out.printf("Looking at %d%n", buffer.get(i));
						return_val++;
					} else {
						//System.out.printf("Foudn %d%n", buffer.get(i));
						break;
					}
				}
						

				if(return_val < 3) {
					//System.out.printf("Throwing away this peak return val is %d%n", return_val);
					buffer.set(psize-2, 700);
					return -1;
				}
			
				else {
					System.out.printf("%d,", peeks.get(psize-2));
					return_val = 0;
					// Delete everything before the beat 
					//System.out.printf("size is %d%n", size);
					for(int i = 0; i < size-1; i++) {
			//			System.out.printf("New beat is %d%n", new_beat);
			//			System.out.printf("Looking at %d%n", buffer.get(0));
			//			System.out.printf("Array size is %d%n", buffer.size());
						if(buffer.get(0) != new_beat) {
							//System.out.printf("Removing %d%n", buffer.get(0));
							return_val++;	
							buffer.remove(0);	
						} else {
			//				System.out.printf("Found %d%n", new_beat);
							break;
						}
					}
					// Now let's remove the peak so it doesn't conflict
					buffer.remove(0);

					
					System.out.printf("new size is %d%n", buffer.size());
					System.out.printf("returning a size of %d%n", return_val);
					printLst(buffer);
					return return_val+1;
				}

			}

		}
	return -1;
	}

	public static void printLst(ArrayList<Integer> lst)
	{
		int size = lst.size();
		System.out.printf("size is %d%n", size);
		for (int i = 0; i < size; i++)
		{
			int item = lst.get(i);
			System.out.printf("element: %s%n", item);
		}
	}

	public static void deleteAllButLast(ArrayList<Integer> lst)
	{
		int size = lst.size();
		for (int i = 0; i < size-1; i++)
		{
			lst.remove(0);
		}
	}
}
