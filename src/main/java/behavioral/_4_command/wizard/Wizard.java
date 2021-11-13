package behavioral._4_command.wizard;

import behavioral._4_command.page.DownloadPage;
import behavioral._4_command.page.LastPage;
import behavioral._4_command.page.Page;
import behavioral._4_command.page.StartPage;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {
	private int currentPage;
	private Deque<Page> pages = new LinkedList<>();

	public void addPage(Page page) {
		pages.add(page);
	}

	public void run() {
		System.out.println("��ġ �����簡 ���۵Ǿ����ϴ�.");
	}

	public void next() {
		if (currentPage == pages.size()) {
			System.out.println("������ �������Դϴ�.");
			return;
		}

		Page page =  pages.pollFirst();
		currentPage += 1;
		System.out.printf("���� ������ : [%s](%d)\n", page.getClass().getSimpleName(), currentPage);
		page.show();
		pages.addLast(page);
	}

	public void previous() {
		if (currentPage == 0) {
			System.out.println("ù �������Դϴ�.");
			return;
		}

		Page page =  pages.pollLast();
		System.out.printf("���� ������ : [%s](%d)\n", page.getClass().getSimpleName(), currentPage);
		currentPage -= 1;
		page.show();
		pages.addFirst(page);
	}

	public boolean finish() {
		if (currentPage != pages.size()) {
			System.out.println("������ �������� �������ּ���.");
			return false;
		}

		System.out.println("��ġ�� �Ϸ�Ǿ����ϴ�.");
		return true;
	}
}
