package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import j0.l;

/* loaded from: classes.dex */
public abstract class j extends c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f9016A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f9017B;

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f8765V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f8824c1) {
                    this.f9016A = true;
                } else if (index == h.f8880j1) {
                    this.f9017B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9016A || this.f9017B) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i8 = 0; i8 < this.f8439s; i8++) {
                    View q8 = constraintLayout.q(this.f8438o[i8]);
                    if (q8 != null) {
                        if (this.f9016A) {
                            q8.setVisibility(visibility);
                        }
                        if (this.f9017B && elevation > 0.0f) {
                            q8.setTranslationZ(q8.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void p(l lVar, int i8, int i9);

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        d();
    }
}
