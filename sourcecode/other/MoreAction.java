/*
Copyright 2010 kiddy
*/
package other;

public enum MoreAction implements IDescription{
	TURN_LEFT {
		public String getDescription() {
			return "����ת";
		}
	},	//�ǵ������ö��ֵ�ָ�ʹ��
	TURN_RIGHT {
		public String getDescription() {
			return "����ת";
		}
	},
	SHOOT {
		public String getDescription() {
			return "���";
		}
	};
	
}
