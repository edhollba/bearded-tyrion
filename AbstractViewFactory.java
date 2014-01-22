public abstract class AbstractViewFactory {
    
    View makeView(ViewGroup parent, View child) {
        child = new View(getApplicationContext());
        child.setVisibility(View.VISIBLE);
        parent.addView(child);
        return child;
    }
    
}
