package leetcode.binarySearch.daily_challenge;

import java.util.PriorityQueue;

public class Seat_Reservation_Manager_Oct_06 {

    private static SeatManager seatManager;
    public void main(String[] args) {
        int n  = 5;
        seatManager = new SeatManager(n);

    }

    class SeatManager {

        private PriorityQueue<Integer> seats;

        public SeatManager(int n) {
            seats = new PriorityQueue<>();
            for(int i=1;i<=n;i++){
                seats.add(i);
            }
        }

        public int reserve() {
            return seats.remove();
        }

        public void unreserve(int seatNumber) {
            seats.add(seatNumber);

        }
    }
}
