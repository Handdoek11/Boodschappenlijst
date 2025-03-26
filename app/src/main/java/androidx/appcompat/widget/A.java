package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0834c;
import f.AbstractC5752a;
import g.AbstractC5794a;

/* loaded from: classes.dex */
public class A extends Spinner {

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f7256z = {R.attr.spinnerMode};

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7257o;

    /* renamed from: s, reason: collision with root package name */
    private final Context f7258s;

    /* renamed from: t, reason: collision with root package name */
    private S f7259t;

    /* renamed from: u, reason: collision with root package name */
    private SpinnerAdapter f7260u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f7261v;

    /* renamed from: w, reason: collision with root package name */
    private h f7262w;

    /* renamed from: x, reason: collision with root package name */
    int f7263x;

    /* renamed from: y, reason: collision with root package name */
    final Rect f7264y;

    class a extends S {

        /* renamed from: A, reason: collision with root package name */
        final /* synthetic */ f f7265A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f7265A = fVar;
        }

        @Override // androidx.appcompat.widget.S
        public k.e b() {
            return this.f7265A;
        }

        @Override // androidx.appcompat.widget.S
        public boolean d() {
            if (A.this.getInternalPopup().a()) {
                return true;
            }
            A.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!A.this.getInternalPopup().a()) {
                A.this.b();
            }
            ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (y0.d.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        DialogInterfaceC0834c f7268o;

        /* renamed from: s, reason: collision with root package name */
        private ListAdapter f7269s;

        /* renamed from: t, reason: collision with root package name */
        private CharSequence f7270t;

        d() {
        }

        @Override // androidx.appcompat.widget.A.h
        public boolean a() {
            DialogInterfaceC0834c dialogInterfaceC0834c = this.f7268o;
            if (dialogInterfaceC0834c != null) {
                return dialogInterfaceC0834c.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.A.h
        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.h
        public void dismiss() {
            DialogInterfaceC0834c dialogInterfaceC0834c = this.f7268o;
            if (dialogInterfaceC0834c != null) {
                dialogInterfaceC0834c.dismiss();
                this.f7268o = null;
            }
        }

        @Override // androidx.appcompat.widget.A.h
        public void f(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence g() {
            return this.f7270t;
        }

        @Override // androidx.appcompat.widget.A.h
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(CharSequence charSequence) {
            this.f7270t = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void l(int i8) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void m(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void n(int i8, int i9) {
            if (this.f7269s == null) {
                return;
            }
            DialogInterfaceC0834c.a aVar = new DialogInterfaceC0834c.a(A.this.getPopupContext());
            CharSequence charSequence = this.f7270t;
            if (charSequence != null) {
                aVar.m(charSequence);
            }
            DialogInterfaceC0834c a8 = aVar.k(this.f7269s, A.this.getSelectedItemPosition(), this).a();
            this.f7268o = a8;
            ListView j8 = a8.j();
            j8.setTextDirection(i8);
            j8.setTextAlignment(i9);
            this.f7268o.show();
        }

        @Override // androidx.appcompat.widget.A.h
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            A.this.setSelection(i8);
            if (A.this.getOnItemClickListener() != null) {
                A.this.performItemClick(null, i8, this.f7269s.getItemId(i8));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.A.h
        public void p(ListAdapter listAdapter) {
            this.f7269s = listAdapter;
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: o, reason: collision with root package name */
        private SpinnerAdapter f7272o;

        /* renamed from: s, reason: collision with root package name */
        private ListAdapter f7273s;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f7272o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f7273s = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f7273s;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i8);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i8) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            return getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i8) {
            ListAdapter listAdapter = this.f7273s;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i8);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7272o;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends T implements h {

        /* renamed from: a0, reason: collision with root package name */
        private CharSequence f7274a0;

        /* renamed from: b0, reason: collision with root package name */
        ListAdapter f7275b0;

        /* renamed from: c0, reason: collision with root package name */
        private final Rect f7276c0;

        /* renamed from: d0, reason: collision with root package name */
        private int f7277d0;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ A f7279o;

            a(A a8) {
                this.f7279o = a8;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                A.this.setSelection(i8);
                if (A.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    A.this.performItemClick(view, i8, fVar.f7275b0.getItemId(i8));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(A.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f7282o;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f7282o = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f7282o);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f7276c0 = new Rect();
            D(A.this);
            J(true);
            P(0);
            L(new a(A.this));
        }

        void T() {
            int i8;
            Drawable i9 = i();
            if (i9 != null) {
                i9.getPadding(A.this.f7264y);
                i8 = q0.b(A.this) ? A.this.f7264y.right : -A.this.f7264y.left;
            } else {
                Rect rect = A.this.f7264y;
                rect.right = 0;
                rect.left = 0;
                i8 = 0;
            }
            int paddingLeft = A.this.getPaddingLeft();
            int paddingRight = A.this.getPaddingRight();
            int width = A.this.getWidth();
            A a8 = A.this;
            int i10 = a8.f7263x;
            if (i10 == -2) {
                int a9 = a8.a((SpinnerAdapter) this.f7275b0, i());
                int i11 = A.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = A.this.f7264y;
                int i12 = (i11 - rect2.left) - rect2.right;
                if (a9 > i12) {
                    a9 = i12;
                }
                F(Math.max(a9, (width - paddingLeft) - paddingRight));
            } else if (i10 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i10);
            }
            f(q0.b(A.this) ? i8 + (((width - paddingRight) - z()) - U()) : i8 + paddingLeft + U());
        }

        public int U() {
            return this.f7277d0;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f7276c0);
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence g() {
            return this.f7274a0;
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(CharSequence charSequence) {
            this.f7274a0 = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void m(int i8) {
            this.f7277d0 = i8;
        }

        @Override // androidx.appcompat.widget.A.h
        public void n(int i8, int i9) {
            ViewTreeObserver viewTreeObserver;
            boolean a8 = a();
            T();
            I(2);
            super.b();
            ListView j8 = j();
            j8.setChoiceMode(1);
            j8.setTextDirection(i8);
            j8.setTextAlignment(i9);
            Q(A.this.getSelectedItemPosition());
            if (a8 || (viewTreeObserver = A.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.T, androidx.appcompat.widget.A.h
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f7275b0 = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        boolean f7284o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i8) {
                return new g[i8];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.f7284o ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f7284o = parcel.readByte() != 0;
        }
    }

    interface h {
        boolean a();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i8);

        CharSequence g();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i8);

        void m(int i8);

        void n(int i8, int i9);

        int o();

        void p(ListAdapter listAdapter);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35369H);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i8 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i9 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i9 = Math.max(i9, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i9;
        }
        drawable.getPadding(this.f7264y);
        Rect rect = this.f7264y;
        return i9 + rect.left + rect.right;
    }

    void b() {
        this.f7262w.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            c0845e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f7262w;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f7262w;
        return hVar != null ? hVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f7262w != null ? this.f7263x : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f7262w;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f7262w;
        return hVar != null ? hVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f7258s;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f7262w;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f7262w;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f7262w.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f7262w == null || View.MeasureSpec.getMode(i8) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f7284o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f7262w;
        gVar.f7284o = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s8 = this.f7259t;
        if (s8 == null || !s8.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f7262w;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i8) {
        h hVar = this.f7262w;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i8);
        } else {
            hVar.m(i8);
            this.f7262w.f(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i8) {
        h hVar = this.f7262w;
        if (hVar != null) {
            hVar.l(i8);
        } else {
            super.setDropDownVerticalOffset(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i8) {
        if (this.f7262w != null) {
            this.f7263x = i8;
        } else {
            super.setDropDownWidth(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f7262w;
        if (hVar != null) {
            hVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i8) {
        setPopupBackgroundDrawable(AbstractC5794a.b(getPopupContext(), i8));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f7262w;
        if (hVar != null) {
            hVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7257o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    public A(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f7261v) {
            this.f7260u = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f7262w != null) {
            Context context = this.f7258s;
            if (context == null) {
                context = getContext();
            }
            this.f7262w.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public A(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(context, attributeSet, i8, i9, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
