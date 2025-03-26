package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: o, reason: collision with root package name */
    private final Calendar f31761o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f31762s;

    class a extends C7013a {
        a() {
        }

        @Override // z0.C7013a
        public void k(View view, A0.z zVar) {
            super.k(view, zVar);
            zVar.m0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i8, Rect rect) {
        if (i8 == 33) {
            setSelection(getAdapter().k());
        } else if (i8 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i8, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o getAdapter() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o adapter = getAdapter();
        adapter.getClass();
        int max = Math.max(adapter.b(), getFirstVisiblePosition());
        int min = Math.min(adapter.k(), getLastVisiblePosition());
        adapter.getItem(max);
        adapter.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z7, int i8, Rect rect) {
        if (z7) {
            a(i8, rect);
        } else {
            super.onFocusChanged(false, i8, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (!super.onKeyDown(i8, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i8) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i8, int i9) {
        if (!this.f31762s) {
            super.onMeasure(i8, i9);
            return;
        }
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i8) {
        if (i8 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i8);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f31761o = z.k();
        if (l.C2(getContext())) {
            setNextFocusLeftId(D3.f.f1530a);
            setNextFocusRightId(D3.f.f1533d);
        }
        this.f31762s = l.E2(getContext());
        X.n0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
