package behavioral._4_command.page;

import behavioral._4_command.control.IControl;
import java.util.*;

public abstract class Page {
	protected List<IControl> controls = new LinkedList<>();
	public void show() { controls.forEach(IControl::show); }
	public Page() { initializeControls(); }
	protected abstract void initializeControls();
}
