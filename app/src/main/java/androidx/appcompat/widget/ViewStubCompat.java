package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: o, reason: collision with root package name */
    private int f7709o;

    /* renamed from: s, reason: collision with root package name */
    private int f7710s;

    /* renamed from: t, reason: collision with root package name */
    private WeakReference f7711t;

    /* renamed from: u, reason: collision with root package name */
    private LayoutInflater f7712u;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f7709o == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f7712u;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f7709o, viewGroup, false);
        int i8 = this.f7710s;
        if (i8 != -1) {
            inflate.setId(i8);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f7711t = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f7710s;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f7712u;
    }

    public int getLayoutResource() {
        return this.f7709o;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i8) {
        this.f7710s = i8;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f7712u = layoutInflater;
    }

    public void setLayoutResource(int i8) {
        this.f7709o = i8;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        WeakReference weakReference = this.f7711t;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i8);
            return;
        }
        super.setVisibility(i8);
        if (i8 == 0 || i8 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7709o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35621O3, i8, 0);
        this.f7710s = obtainStyledAttributes.getResourceId(f.j.f35636R3, -1);
        this.f7709o = obtainStyledAttributes.getResourceId(f.j.f35631Q3, 0);
        setId(obtainStyledAttributes.getResourceId(f.j.f35626P3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
