package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j0.C6049a;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: A, reason: collision with root package name */
    private int f8418A;

    /* renamed from: B, reason: collision with root package name */
    private int f8419B;

    /* renamed from: C, reason: collision with root package name */
    private C6049a f8420C;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(j0.e eVar, int i8, boolean z7) {
        this.f8419B = i8;
        if (z7) {
            int i9 = this.f8418A;
            if (i9 == 5) {
                this.f8419B = 1;
            } else if (i9 == 6) {
                this.f8419B = 0;
            }
        } else {
            int i10 = this.f8418A;
            if (i10 == 5) {
                this.f8419B = 0;
            } else if (i10 == 6) {
                this.f8419B = 1;
            }
        }
        if (eVar instanceof C6049a) {
            ((C6049a) eVar).B1(this.f8419B);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f8420C.v1();
    }

    public int getMargin() {
        return this.f8420C.x1();
    }

    public int getType() {
        return this.f8418A;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f8420C = new C6049a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f8765V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f8896l1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8888k1) {
                    this.f8420C.A1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == h.f8904m1) {
                    this.f8420C.C1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8441u = this.f8420C;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(j0.e eVar, boolean z7) {
        p(eVar, this.f8418A, z7);
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.f8420C.A1(z7);
    }

    public void setDpMargin(int i8) {
        this.f8420C.C1((int) ((i8 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i8) {
        this.f8420C.C1(i8);
    }

    public void setType(int i8) {
        this.f8418A = i8;
    }
}
