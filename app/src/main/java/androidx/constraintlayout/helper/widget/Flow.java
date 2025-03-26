package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.j;
import j0.e;
import j0.g;
import j0.l;

/* loaded from: classes.dex */
public class Flow extends j {

    /* renamed from: C, reason: collision with root package name */
    private g f8306C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.j, androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f8306C = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f8765V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f8773W0) {
                    this.f8306C.E2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8781X0) {
                    this.f8306C.J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8864h1) {
                    this.f8306C.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8872i1) {
                    this.f8306C.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8789Y0) {
                    this.f8306C.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8797Z0) {
                    this.f8306C.P1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8806a1) {
                    this.f8306C.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8815b1) {
                    this.f8306C.K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8654H1) {
                    this.f8306C.J2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8992x1) {
                    this.f8306C.y2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8646G1) {
                    this.f8306C.I2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8944r1) {
                    this.f8306C.s2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f9008z1) {
                    this.f8306C.A2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8960t1) {
                    this.f8306C.u2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8606B1) {
                    this.f8306C.C2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f8976v1) {
                    this.f8306C.w2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f8936q1) {
                    this.f8306C.r2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f9000y1) {
                    this.f8306C.z2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f8952s1) {
                    this.f8306C.t2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f8598A1) {
                    this.f8306C.B2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f8630E1) {
                    this.f8306C.G2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f8968u1) {
                    this.f8306C.v2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == h.f8622D1) {
                    this.f8306C.F2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == h.f8984w1) {
                    this.f8306C.x2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8638F1) {
                    this.f8306C.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f8614C1) {
                    this.f8306C.D2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8441u = this.f8306C;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(e eVar, boolean z7) {
        this.f8306C.u1(z7);
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i8, int i9) {
        p(this.f8306C, i8, i9);
    }

    @Override // androidx.constraintlayout.widget.j
    public void p(l lVar, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.D1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.y1(), lVar.x1());
        }
    }

    public void setFirstHorizontalBias(float f8) {
        this.f8306C.r2(f8);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i8) {
        this.f8306C.s2(i8);
        requestLayout();
    }

    public void setFirstVerticalBias(float f8) {
        this.f8306C.t2(f8);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i8) {
        this.f8306C.u2(i8);
        requestLayout();
    }

    public void setHorizontalAlign(int i8) {
        this.f8306C.v2(i8);
        requestLayout();
    }

    public void setHorizontalBias(float f8) {
        this.f8306C.w2(f8);
        requestLayout();
    }

    public void setHorizontalGap(int i8) {
        this.f8306C.x2(i8);
        requestLayout();
    }

    public void setHorizontalStyle(int i8) {
        this.f8306C.y2(i8);
        requestLayout();
    }

    public void setLastHorizontalBias(float f8) {
        this.f8306C.z2(f8);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i8) {
        this.f8306C.A2(i8);
        requestLayout();
    }

    public void setLastVerticalBias(float f8) {
        this.f8306C.B2(f8);
        requestLayout();
    }

    public void setLastVerticalStyle(int i8) {
        this.f8306C.C2(i8);
        requestLayout();
    }

    public void setMaxElementsWrap(int i8) {
        this.f8306C.D2(i8);
        requestLayout();
    }

    public void setOrientation(int i8) {
        this.f8306C.E2(i8);
        requestLayout();
    }

    public void setPadding(int i8) {
        this.f8306C.J1(i8);
        requestLayout();
    }

    public void setPaddingBottom(int i8) {
        this.f8306C.K1(i8);
        requestLayout();
    }

    public void setPaddingLeft(int i8) {
        this.f8306C.M1(i8);
        requestLayout();
    }

    public void setPaddingRight(int i8) {
        this.f8306C.N1(i8);
        requestLayout();
    }

    public void setPaddingTop(int i8) {
        this.f8306C.P1(i8);
        requestLayout();
    }

    public void setVerticalAlign(int i8) {
        this.f8306C.F2(i8);
        requestLayout();
    }

    public void setVerticalBias(float f8) {
        this.f8306C.G2(f8);
        requestLayout();
    }

    public void setVerticalGap(int i8) {
        this.f8306C.H2(i8);
        requestLayout();
    }

    public void setVerticalStyle(int i8) {
        this.f8306C.I2(i8);
        requestLayout();
    }

    public void setWrapMode(int i8) {
        this.f8306C.J2(i8);
        requestLayout();
    }
}
