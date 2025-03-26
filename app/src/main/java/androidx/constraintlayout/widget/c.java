package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: o, reason: collision with root package name */
    protected int[] f8438o;

    /* renamed from: s, reason: collision with root package name */
    protected int f8439s;

    /* renamed from: t, reason: collision with root package name */
    protected Context f8440t;

    /* renamed from: u, reason: collision with root package name */
    protected j0.i f8441u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f8442v;

    /* renamed from: w, reason: collision with root package name */
    protected String f8443w;

    /* renamed from: x, reason: collision with root package name */
    protected String f8444x;

    /* renamed from: y, reason: collision with root package name */
    private View[] f8445y;

    /* renamed from: z, reason: collision with root package name */
    protected HashMap f8446z;

    public c(Context context) {
        super(context);
        this.f8438o = new int[32];
        this.f8442v = false;
        this.f8445y = null;
        this.f8446z = new HashMap();
        this.f8440t = context;
        i(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f8440t == null) {
            return;
        }
        String trim = str.trim();
        int h8 = h(trim);
        if (h8 != 0) {
            this.f8446z.put(Integer.valueOf(h8), trim);
            b(h8);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i8) {
        if (i8 == getId()) {
            return;
        }
        int i9 = this.f8439s + 1;
        int[] iArr = this.f8438o;
        if (i9 > iArr.length) {
            this.f8438o = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8438o;
        int i10 = this.f8439s;
        iArr2[i10] = i8;
        this.f8439s = i10 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f8440t == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f8364c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f8440t.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i8 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object i9 = constraintLayout.i(0, str);
            if (i9 instanceof Integer) {
                i8 = ((Integer) i9).intValue();
            }
        }
        if (i8 == 0 && constraintLayout != null) {
            i8 = g(constraintLayout, str);
        }
        if (i8 == 0) {
            try {
                i8 = g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i8 == 0 ? this.f8440t.getResources().getIdentifier(str, "id", this.f8440t.getPackageName()) : i8;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i8 = 0; i8 < this.f8439s; i8++) {
            View q8 = constraintLayout.q(this.f8438o[i8]);
            if (q8 != null) {
                q8.setVisibility(visibility);
                if (elevation > 0.0f) {
                    q8.setTranslationZ(q8.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8438o, this.f8439s);
    }

    protected void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f8765V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f8920o1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8443w = string;
                    setIds(string);
                } else if (index == h.f8928p1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f8444x = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(j0.e eVar, boolean z7);

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintLayout constraintLayout) {
        String str;
        int g8;
        if (isInEditMode()) {
            setIds(this.f8443w);
        }
        j0.i iVar = this.f8441u;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i8 = 0; i8 < this.f8439s; i8++) {
            int i9 = this.f8438o[i8];
            View q8 = constraintLayout.q(i9);
            if (q8 == null && (g8 = g(constraintLayout, (str = (String) this.f8446z.get(Integer.valueOf(i9))))) != 0) {
                this.f8438o[i8] = g8;
                this.f8446z.put(Integer.valueOf(g8), str);
                q8 = constraintLayout.q(g8);
            }
            if (q8 != null) {
                this.f8441u.a(constraintLayout.r(q8));
            }
        }
        this.f8441u.c(constraintLayout.f8325t);
    }

    public void o() {
        if (this.f8441u == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f8402v0 = (j0.e) this.f8441u;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8443w;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8444x;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f8442v) {
            super.onMeasure(i8, i9);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f8443w = str;
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.f8439s = 0;
        while (true) {
            int indexOf = str.indexOf(44, i8);
            if (indexOf == -1) {
                a(str.substring(i8));
                return;
            } else {
                a(str.substring(i8, indexOf));
                i8 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f8444x = str;
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.f8439s = 0;
        while (true) {
            int indexOf = str.indexOf(44, i8);
            if (indexOf == -1) {
                c(str.substring(i8));
                return;
            } else {
                c(str.substring(i8, indexOf));
                i8 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8443w = null;
        this.f8439s = 0;
        for (int i8 : iArr) {
            b(i8);
        }
    }

    @Override // android.view.View
    public void setTag(int i8, Object obj) {
        super.setTag(i8, obj);
        if (obj == null && this.f8443w == null) {
            b(i8);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8438o = new int[32];
        this.f8442v = false;
        this.f8445y = null;
        this.f8446z = new HashMap();
        this.f8440t = context;
        i(attributeSet);
    }
}
