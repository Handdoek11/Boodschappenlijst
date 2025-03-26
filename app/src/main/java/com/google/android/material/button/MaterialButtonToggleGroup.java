package com.google.android.material.button;

import A0.z;
import D3.k;
import V3.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import z0.AbstractC7054v;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: B, reason: collision with root package name */
    private static final int f31534B = k.f1629s;

    /* renamed from: A, reason: collision with root package name */
    private Set f31535A;

    /* renamed from: o, reason: collision with root package name */
    private final List f31536o;

    /* renamed from: s, reason: collision with root package name */
    private final e f31537s;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedHashSet f31538t;

    /* renamed from: u, reason: collision with root package name */
    private final Comparator f31539u;

    /* renamed from: v, reason: collision with root package name */
    private Integer[] f31540v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f31541w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f31542x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f31543y;

    /* renamed from: z, reason: collision with root package name */
    private final int f31544z;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C7013a {
        b() {
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            super.k(view, zVar);
            zVar.n0(z.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final V3.c f31547e = new V3.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        V3.c f31548a;

        /* renamed from: b, reason: collision with root package name */
        V3.c f31549b;

        /* renamed from: c, reason: collision with root package name */
        V3.c f31550c;

        /* renamed from: d, reason: collision with root package name */
        V3.c f31551d;

        c(V3.c cVar, V3.c cVar2, V3.c cVar3, V3.c cVar4) {
            this.f31548a = cVar;
            this.f31549b = cVar3;
            this.f31550c = cVar4;
            this.f31551d = cVar2;
        }

        public static c a(c cVar) {
            V3.c cVar2 = f31547e;
            return new c(cVar2, cVar.f31551d, cVar2, cVar.f31550c);
        }

        public static c b(c cVar, View view) {
            return o.g(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            V3.c cVar2 = cVar.f31548a;
            V3.c cVar3 = cVar.f31551d;
            V3.c cVar4 = f31547e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            V3.c cVar2 = f31547e;
            return new c(cVar2, cVar2, cVar.f31549b, cVar.f31550c);
        }

        public static c e(c cVar, View view) {
            return o.g(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            V3.c cVar2 = cVar.f31548a;
            V3.c cVar3 = f31547e;
            return new c(cVar2, cVar3, cVar.f31549b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i8, boolean z7);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z7) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1422u);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i8 = firstVisibleChildIndex + 1; i8 < getChildCount(); i8++) {
            MaterialButton h8 = h(i8);
            int min = Math.min(h8.getStrokeWidth(), h(i8 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d8 = d(h8);
            if (getOrientation() == 0) {
                AbstractC7054v.c(d8, 0);
                AbstractC7054v.d(d8, -min);
                d8.topMargin = 0;
            } else {
                d8.bottomMargin = 0;
                d8.topMargin = -min;
                AbstractC7054v.d(d8, 0);
            }
            h8.setLayoutParams(d8);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i8, boolean z7) {
        if (i8 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i8);
            return;
        }
        HashSet hashSet = new HashSet(this.f31535A);
        if (z7 && !hashSet.contains(Integer.valueOf(i8))) {
            if (this.f31542x && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i8));
        } else {
            if (z7 || !hashSet.contains(Integer.valueOf(i8))) {
                return;
            }
            if (!this.f31543y || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i8));
            }
        }
        q(hashSet);
    }

    private void g(int i8, boolean z7) {
        Iterator it = this.f31538t.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i8, z7);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (k(i8)) {
                return i8;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if ((getChildAt(i9) instanceof MaterialButton) && k(i9)) {
                i8++;
            }
        }
        return i8;
    }

    private MaterialButton h(int i8) {
        return (MaterialButton) getChildAt(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) == view) {
                return i8;
            }
            if ((getChildAt(i9) instanceof MaterialButton) && k(i9)) {
                i8++;
            }
        }
        return -1;
    }

    private c j(int i8, int i9, int i10) {
        c cVar = (c) this.f31536o.get(i8);
        if (i9 == i10) {
            return cVar;
        }
        boolean z7 = getOrientation() == 0;
        if (i8 == i9) {
            return z7 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i8 == i10) {
            return z7 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i8) {
        return getChildAt(i8).getVisibility() != 8;
    }

    private void n(int i8) {
        if (getChildCount() == 0 || i8 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i8).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC7054v.c(layoutParams, 0);
            AbstractC7054v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i8, boolean z7) {
        View findViewById = findViewById(i8);
        if (findViewById instanceof MaterialButton) {
            this.f31541w = true;
            ((MaterialButton) findViewById).setChecked(z7);
            this.f31541w = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f31548a).t(cVar.f31551d).F(cVar.f31549b).x(cVar.f31550c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f31535A;
        this.f31535A = new HashSet(set);
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            int id = h(i8).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f31539u);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            treeMap.put(h(i8), Integer.valueOf(i8));
        }
        this.f31540v = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(X.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f31537s);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            h(i8).setA11yClassName((this.f31542x ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i8, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        V3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f31536o.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        X.n0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f31538t.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f31542x || this.f31535A.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f31535A.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            int id = h(i8).getId();
            if (this.f31535A.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        Integer[] numArr = this.f31540v;
        if (numArr != null && i9 < numArr.length) {
            return numArr[i9].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i9;
    }

    public boolean l() {
        return this.f31542x;
    }

    void m(MaterialButton materialButton, boolean z7) {
        if (this.f31541w) {
            return;
        }
        e(materialButton.getId(), z7);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.f31544z;
        if (i8 != -1) {
            q(Collections.singleton(Integer.valueOf(i8)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.M0(accessibilityNodeInfo).m0(z.e.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        s();
        c();
        super.onMeasure(i8, i9);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f31536o.remove(indexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i8 = 0; i8 < childCount; i8++) {
            MaterialButton h8 = h(i8);
            if (h8.getVisibility() != 8) {
                k.b v7 = h8.getShapeAppearanceModel().v();
                p(v7, j(i8, firstVisibleChildIndex, lastVisibleChildIndex));
                h8.setShapeAppearanceModel(v7.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            h(i8).setEnabled(z7);
        }
    }

    public void setSelectionRequired(boolean z7) {
        this.f31543y = z7;
    }

    public void setSingleSelection(boolean z7) {
        if (this.f31542x != z7) {
            this.f31542x = z7;
            f();
        }
        t();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f31534B;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f31536o = new ArrayList();
        this.f31537s = new e(this, null);
        this.f31538t = new LinkedHashSet();
        this.f31539u = new a();
        this.f31541w = false;
        this.f31535A = new HashSet();
        TypedArray i10 = l.i(getContext(), attributeSet, D3.l.f1944l3, i8, i9, new int[0]);
        setSingleSelection(i10.getBoolean(D3.l.f1980p3, false));
        this.f31544z = i10.getResourceId(D3.l.f1962n3, -1);
        this.f31543y = i10.getBoolean(D3.l.f1971o3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(i10.getBoolean(D3.l.f1953m3, true));
        i10.recycle();
        X.w0(this, 1);
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }
}
