package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: o, reason: collision with root package name */
    private boolean f8417o;

    public Guideline(Context context) {
        super(context);
        this.f8417o = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z7) {
        this.f8417o = z7;
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f8417o && bVar.f8359a == i8) {
            return;
        }
        bVar.f8359a = i8;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f8417o && bVar.f8361b == i8) {
            return;
        }
        bVar.f8361b = i8;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f8417o && bVar.f8363c == f8) {
            return;
        }
        bVar.f8363c = f8;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8417o = true;
        super.setVisibility(8);
    }
}
