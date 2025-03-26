package com.google.android.material.timepicker;

import D3.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: Q, reason: collision with root package name */
    private final Chip f32642Q;

    /* renamed from: R, reason: collision with root package name */
    private final Chip f32643R;

    /* renamed from: S, reason: collision with root package name */
    private final ClockHandView f32644S;

    /* renamed from: T, reason: collision with root package name */
    private final ClockFaceView f32645T;

    /* renamed from: U, reason: collision with root package name */
    private final MaterialButtonToggleGroup f32646U;

    /* renamed from: V, reason: collision with root package name */
    private final View.OnClickListener f32647V;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.E(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.F(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ GestureDetector f32650o;

        c(GestureDetector gestureDetector) {
            this.f32650o = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f32650o.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(MaterialButtonToggleGroup materialButtonToggleGroup, int i8, boolean z7) {
    }

    private void H() {
        this.f32642Q.setTag(D3.f.f1518H, 12);
        this.f32643R.setTag(D3.f.f1518H, 10);
        this.f32642Q.setOnClickListener(this.f32647V);
        this.f32643R.setOnClickListener(this.f32647V);
        this.f32642Q.setAccessibilityClassName("android.view.View");
        this.f32643R.setAccessibilityClassName("android.view.View");
    }

    private void I() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f32642Q.setOnTouchListener(cVar);
        this.f32643R.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        if (view == this && i8 == 0) {
            this.f32643R.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32647V = new a();
        LayoutInflater.from(context).inflate(h.f1570m, this);
        this.f32645T = (ClockFaceView) findViewById(D3.f.f1538i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(D3.f.f1541l);
        this.f32646U = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.g
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i9, boolean z7) {
                this.f32665a.G(materialButtonToggleGroup2, i9, z7);
            }
        });
        this.f32642Q = (Chip) findViewById(D3.f.f1544o);
        this.f32643R = (Chip) findViewById(D3.f.f1542m);
        this.f32644S = (ClockHandView) findViewById(D3.f.f1539j);
        I();
        H();
    }
}
