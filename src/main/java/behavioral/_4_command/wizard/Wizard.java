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
		System.out.println("설치 마법사가 시작되었습니다.");
	}

	public void next() {
		if (currentPage == pages.size()) {
			System.out.println("마지막 페이지입니다.");
			return;
		}

		Page page =  pages.pollFirst();
		currentPage += 1;
		System.out.printf("현재 페이지 : [%s](%d)\n", page.getClass().getSimpleName(), currentPage);
		page.show();
		pages.addLast(page);
	}

	public void previous() {
		if (currentPage == 0) {
			System.out.println("첫 페이지입니다.");
			return;
		}

		Page page =  pages.pollLast();
		System.out.printf("현재 페이지 : [%s](%d)\n", page.getClass().getSimpleName(), currentPage);
		currentPage -= 1;
		page.show();
		pages.addFirst(page);
	}

	public boolean finish() {
		if (currentPage != pages.size()) {
			System.out.println("마지막 절차까지 진행해주세요.");
			return false;
		}

		System.out.println("설치가 완료되었습니다.");
		return true;
	}
}
