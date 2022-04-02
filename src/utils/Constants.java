package utils;

public class Constants {
    public static class Direction {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}


	public static class PlayerConstants {
		public static final int IDLE = 3;

		public static final int RUNNING = 4;
		// public static final int JUMP = 2;
		// public static final int FALLING =1;
		public static final int SLEEP = 6;
		public static final int ATTACK = 0;
		
		public static int GetSpriteAmount(int player_action) {
			switch(player_action) {
				case IDLE:
					return 3;
				case RUNNING:
					return 5;
				// case JUMP:
				// 	return 2;
				// case FALLING:
				// 	return 3;
				case SLEEP:
					return 5;
				case ATTACK:
					return 5;
				default:
					return 1;
				
			
			}
		}
	}
}
