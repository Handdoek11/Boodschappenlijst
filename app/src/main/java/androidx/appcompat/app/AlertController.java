package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import f.AbstractC5752a;
import f.AbstractC5757f;
import java.lang.ref.WeakReference;
import z0.X;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f6672A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f6674C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f6675D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f6676E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f6677F;

    /* renamed from: G, reason: collision with root package name */
    private View f6678G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f6679H;

    /* renamed from: J, reason: collision with root package name */
    private int f6681J;

    /* renamed from: K, reason: collision with root package name */
    private int f6682K;

    /* renamed from: L, reason: collision with root package name */
    int f6683L;

    /* renamed from: M, reason: collision with root package name */
    int f6684M;

    /* renamed from: N, reason: collision with root package name */
    int f6685N;

    /* renamed from: O, reason: collision with root package name */
    int f6686O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f6687P;

    /* renamed from: R, reason: collision with root package name */
    Handler f6689R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6691a;

    /* renamed from: b, reason: collision with root package name */
    final y f6692b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f6693c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6694d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f6695e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f6696f;

    /* renamed from: g, reason: collision with root package name */
    ListView f6697g;

    /* renamed from: h, reason: collision with root package name */
    private View f6698h;

    /* renamed from: i, reason: collision with root package name */
    private int f6699i;

    /* renamed from: j, reason: collision with root package name */
    private int f6700j;

    /* renamed from: k, reason: collision with root package name */
    private int f6701k;

    /* renamed from: l, reason: collision with root package name */
    private int f6702l;

    /* renamed from: m, reason: collision with root package name */
    private int f6703m;

    /* renamed from: o, reason: collision with root package name */
    Button f6705o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f6706p;

    /* renamed from: q, reason: collision with root package name */
    Message f6707q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f6708r;

    /* renamed from: s, reason: collision with root package name */
    Button f6709s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f6710t;

    /* renamed from: u, reason: collision with root package name */
    Message f6711u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f6712v;

    /* renamed from: w, reason: collision with root package name */
    Button f6713w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f6714x;

    /* renamed from: y, reason: collision with root package name */
    Message f6715y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f6716z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6704n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f6673B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f6680I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f6688Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f6690S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: o, reason: collision with root package name */
        private final int f6717o;

        /* renamed from: s, reason: collision with root package name */
        private final int f6718s;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35682c2);
            this.f6718s = obtainStyledAttributes.getDimensionPixelOffset(f.j.f35687d2, -1);
            this.f6717o = obtainStyledAttributes.getDimensionPixelOffset(f.j.f35692e2, -1);
        }

        public void a(boolean z7, boolean z8) {
            if (z8 && z7) {
                return;
            }
            setPadding(getPaddingLeft(), z7 ? getPaddingTop() : this.f6717o, getPaddingRight(), z8 ? getPaddingBottom() : this.f6718s);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f6705o || (message3 = alertController.f6707q) == null) ? (view != alertController.f6709s || (message2 = alertController.f6711u) == null) ? (view != alertController.f6713w || (message = alertController.f6715y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f6689R.obtainMessage(1, alertController2.f6692b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f6720A;

        /* renamed from: B, reason: collision with root package name */
        public int f6721B;

        /* renamed from: C, reason: collision with root package name */
        public int f6722C;

        /* renamed from: D, reason: collision with root package name */
        public int f6723D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f6725F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f6726G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f6727H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f6729J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f6730K;

        /* renamed from: L, reason: collision with root package name */
        public String f6731L;

        /* renamed from: M, reason: collision with root package name */
        public String f6732M;

        /* renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f6733N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f6735a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f6736b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f6738d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f6740f;

        /* renamed from: g, reason: collision with root package name */
        public View f6741g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f6742h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f6743i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f6744j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f6745k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f6746l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f6747m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f6748n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f6749o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f6750p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f6751q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f6753s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f6754t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f6755u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f6756v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f6757w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f6758x;

        /* renamed from: y, reason: collision with root package name */
        public int f6759y;

        /* renamed from: z, reason: collision with root package name */
        public View f6760z;

        /* renamed from: c, reason: collision with root package name */
        public int f6737c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f6739e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f6724E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f6728I = -1;

        /* renamed from: O, reason: collision with root package name */
        public boolean f6734O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f6752r = true;

        class a extends ArrayAdapter {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ RecycleListView f6761o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i8, int i9, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i8, i9, charSequenceArr);
                this.f6761o = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i8, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i8, view, viewGroup);
                boolean[] zArr = b.this.f6725F;
                if (zArr != null && zArr[i8]) {
                    this.f6761o.setItemChecked(i8, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0132b extends CursorAdapter {

            /* renamed from: o, reason: collision with root package name */
            private final int f6763o;

            /* renamed from: s, reason: collision with root package name */
            private final int f6764s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ RecycleListView f6765t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ AlertController f6766u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0132b(Context context, Cursor cursor, boolean z7, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z7);
                this.f6765t = recycleListView;
                this.f6766u = alertController;
                Cursor cursor2 = getCursor();
                this.f6763o = cursor2.getColumnIndexOrThrow(b.this.f6731L);
                this.f6764s = cursor2.getColumnIndexOrThrow(b.this.f6732M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f6763o));
                this.f6765t.setItemChecked(cursor.getPosition(), cursor.getInt(this.f6764s) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f6736b.inflate(this.f6766u.f6684M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ AlertController f6768o;

            c(AlertController alertController) {
                this.f6768o = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                b.this.f6758x.onClick(this.f6768o.f6692b, i8);
                if (b.this.f6727H) {
                    return;
                }
                this.f6768o.f6692b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ RecycleListView f6770o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ AlertController f6771s;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f6770o = recycleListView;
                this.f6771s = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                boolean[] zArr = b.this.f6725F;
                if (zArr != null) {
                    zArr[i8] = this.f6770o.isItemChecked(i8);
                }
                b.this.f6729J.onClick(this.f6771s.f6692b, i8, this.f6770o.isItemChecked(i8));
            }
        }

        public b(Context context) {
            this.f6735a = context;
            this.f6736b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f6736b.inflate(alertController.f6683L, (ViewGroup) null);
            if (this.f6726G) {
                listAdapter = this.f6730K == null ? new a(this.f6735a, alertController.f6684M, R.id.text1, this.f6756v, recycleListView) : new C0132b(this.f6735a, this.f6730K, false, recycleListView, alertController);
            } else {
                int i8 = this.f6727H ? alertController.f6685N : alertController.f6686O;
                if (this.f6730K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f6735a, i8, this.f6730K, new String[]{this.f6731L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f6757w;
                    if (listAdapter == null) {
                        listAdapter = new d(this.f6735a, i8, R.id.text1, this.f6756v);
                    }
                }
            }
            alertController.f6679H = listAdapter;
            alertController.f6680I = this.f6728I;
            if (this.f6758x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f6729J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f6733N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f6727H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f6726G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f6697g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f6741g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f6740f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f6738d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i8 = this.f6737c;
                if (i8 != 0) {
                    alertController.l(i8);
                }
                int i9 = this.f6739e;
                if (i9 != 0) {
                    alertController.l(alertController.c(i9));
                }
            }
            CharSequence charSequence2 = this.f6742h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f6743i;
            if (charSequence3 != null || this.f6744j != null) {
                alertController.j(-1, charSequence3, this.f6745k, null, this.f6744j);
            }
            CharSequence charSequence4 = this.f6746l;
            if (charSequence4 != null || this.f6747m != null) {
                alertController.j(-2, charSequence4, this.f6748n, null, this.f6747m);
            }
            CharSequence charSequence5 = this.f6749o;
            if (charSequence5 != null || this.f6750p != null) {
                alertController.j(-3, charSequence5, this.f6751q, null, this.f6750p);
            }
            if (this.f6756v != null || this.f6730K != null || this.f6757w != null) {
                b(alertController);
            }
            View view2 = this.f6760z;
            if (view2 != null) {
                if (this.f6724E) {
                    alertController.s(view2, this.f6720A, this.f6721B, this.f6722C, this.f6723D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i10 = this.f6759y;
            if (i10 != 0) {
                alertController.q(i10);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f6773a;

        public c(DialogInterface dialogInterface) {
            this.f6773a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == -3 || i8 == -2 || i8 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f6773a.get(), message.what);
            } else {
                if (i8 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i8, int i9, CharSequence[] charSequenceArr) {
            super(context, i8, i9, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, y yVar, Window window) {
        this.f6691a = context;
        this.f6692b = yVar;
        this.f6693c = window;
        this.f6689R = new c(yVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.j.f35572F, AbstractC5752a.f35384k, 0);
        this.f6681J = obtainStyledAttributes.getResourceId(f.j.f35577G, 0);
        this.f6682K = obtainStyledAttributes.getResourceId(f.j.f35587I, 0);
        this.f6683L = obtainStyledAttributes.getResourceId(f.j.f35597K, 0);
        this.f6684M = obtainStyledAttributes.getResourceId(f.j.f35602L, 0);
        this.f6685N = obtainStyledAttributes.getResourceId(f.j.f35612N, 0);
        this.f6686O = obtainStyledAttributes.getResourceId(f.j.f35592J, 0);
        this.f6687P = obtainStyledAttributes.getBoolean(f.j.f35607M, true);
        this.f6694d = obtainStyledAttributes.getDimensionPixelSize(f.j.f35582H, 0);
        obtainStyledAttributes.recycle();
        yVar.i(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i8 = this.f6682K;
        return i8 == 0 ? this.f6681J : this.f6688Q == 1 ? i8 : this.f6681J;
    }

    private void o(ViewGroup viewGroup, View view, int i8, int i9) {
        View findViewById = this.f6693c.findViewById(AbstractC5757f.f35504v);
        View findViewById2 = this.f6693c.findViewById(AbstractC5757f.f35503u);
        X.E0(view, i8, i9);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i8;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f6705o = button;
        button.setOnClickListener(this.f6690S);
        if (TextUtils.isEmpty(this.f6706p) && this.f6708r == null) {
            this.f6705o.setVisibility(8);
            i8 = 0;
        } else {
            this.f6705o.setText(this.f6706p);
            Drawable drawable = this.f6708r;
            if (drawable != null) {
                int i9 = this.f6694d;
                drawable.setBounds(0, 0, i9, i9);
                this.f6705o.setCompoundDrawables(this.f6708r, null, null, null);
            }
            this.f6705o.setVisibility(0);
            i8 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f6709s = button2;
        button2.setOnClickListener(this.f6690S);
        if (TextUtils.isEmpty(this.f6710t) && this.f6712v == null) {
            this.f6709s.setVisibility(8);
        } else {
            this.f6709s.setText(this.f6710t);
            Drawable drawable2 = this.f6712v;
            if (drawable2 != null) {
                int i10 = this.f6694d;
                drawable2.setBounds(0, 0, i10, i10);
                this.f6709s.setCompoundDrawables(this.f6712v, null, null, null);
            }
            this.f6709s.setVisibility(0);
            i8 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f6713w = button3;
        button3.setOnClickListener(this.f6690S);
        if (TextUtils.isEmpty(this.f6714x) && this.f6716z == null) {
            this.f6713w.setVisibility(8);
        } else {
            this.f6713w.setText(this.f6714x);
            Drawable drawable3 = this.f6716z;
            if (drawable3 != null) {
                int i11 = this.f6694d;
                drawable3.setBounds(0, 0, i11, i11);
                this.f6713w.setCompoundDrawables(this.f6716z, null, null, null);
            }
            this.f6713w.setVisibility(0);
            i8 |= 4;
        }
        if (y(this.f6691a)) {
            if (i8 == 1) {
                b(this.f6705o);
            } else if (i8 == 2) {
                b(this.f6709s);
            } else if (i8 == 4) {
                b(this.f6713w);
            }
        }
        if (i8 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f6693c.findViewById(AbstractC5757f.f35505w);
        this.f6672A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f6672A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f6677F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f6696f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f6672A.removeView(this.f6677F);
        if (this.f6697g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f6672A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f6672A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f6697g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f6698h;
        if (view == null) {
            view = this.f6699i != 0 ? LayoutInflater.from(this.f6691a).inflate(this.f6699i, viewGroup, false) : null;
        }
        boolean z7 = view != null;
        if (!z7 || !a(view)) {
            this.f6693c.setFlags(131072, 131072);
        }
        if (!z7) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f6693c.findViewById(AbstractC5757f.f35496n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f6704n) {
            frameLayout.setPadding(this.f6700j, this.f6701k, this.f6702l, this.f6703m);
        }
        if (this.f6697g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f6678G != null) {
            viewGroup.addView(this.f6678G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f6693c.findViewById(AbstractC5757f.f35481O).setVisibility(8);
            return;
        }
        this.f6675D = (ImageView) this.f6693c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f6695e) || !this.f6687P) {
            this.f6693c.findViewById(AbstractC5757f.f35481O).setVisibility(8);
            this.f6675D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f6693c.findViewById(AbstractC5757f.f35492j);
        this.f6676E = textView;
        textView.setText(this.f6695e);
        int i8 = this.f6673B;
        if (i8 != 0) {
            this.f6675D.setImageResource(i8);
            return;
        }
        Drawable drawable = this.f6674C;
        if (drawable != null) {
            this.f6675D.setImageDrawable(drawable);
        } else {
            this.f6676E.setPadding(this.f6675D.getPaddingLeft(), this.f6675D.getPaddingTop(), this.f6675D.getPaddingRight(), this.f6675D.getPaddingBottom());
            this.f6675D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f6693c.findViewById(AbstractC5757f.f35502t);
        View findViewById4 = findViewById3.findViewById(AbstractC5757f.f35482P);
        View findViewById5 = findViewById3.findViewById(AbstractC5757f.f35495m);
        View findViewById6 = findViewById3.findViewById(AbstractC5757f.f35493k);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(AbstractC5757f.f35497o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(AbstractC5757f.f35482P);
        View findViewById8 = viewGroup.findViewById(AbstractC5757f.f35495m);
        View findViewById9 = viewGroup.findViewById(AbstractC5757f.f35493k);
        ViewGroup h8 = h(findViewById7, findViewById4);
        ViewGroup h9 = h(findViewById8, findViewById5);
        ViewGroup h10 = h(findViewById9, findViewById6);
        u(h9);
        t(h10);
        w(h8);
        boolean z7 = viewGroup.getVisibility() != 8;
        boolean z8 = (h8 == null || h8.getVisibility() == 8) ? 0 : 1;
        boolean z9 = (h10 == null || h10.getVisibility() == 8) ? false : true;
        if (!z9 && h9 != null && (findViewById2 = h9.findViewById(AbstractC5757f.f35477K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z8 != 0) {
            NestedScrollView nestedScrollView = this.f6672A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f6696f == null && this.f6697g == null) ? null : h8.findViewById(AbstractC5757f.f35480N);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (h9 != null && (findViewById = h9.findViewById(AbstractC5757f.f35478L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f6697g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z8, z9);
        }
        if (!z7) {
            View view = this.f6697g;
            if (view == null) {
                view = this.f6672A;
            }
            if (view != null) {
                o(h9, view, z8 | (z9 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f6697g;
        if (listView2 == null || (listAdapter = this.f6679H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = this.f6680I;
        if (i8 > -1) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5752a.f35383j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i8) {
        TypedValue typedValue = new TypedValue();
        this.f6691a.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f6697g;
    }

    public void e() {
        this.f6692b.setContentView(i());
        x();
    }

    public boolean f(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6672A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6672A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f6689R.obtainMessage(i8, onClickListener);
        }
        if (i8 == -3) {
            this.f6714x = charSequence;
            this.f6715y = message;
            this.f6716z = drawable;
        } else if (i8 == -2) {
            this.f6710t = charSequence;
            this.f6711u = message;
            this.f6712v = drawable;
        } else {
            if (i8 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f6706p = charSequence;
            this.f6707q = message;
            this.f6708r = drawable;
        }
    }

    public void k(View view) {
        this.f6678G = view;
    }

    public void l(int i8) {
        this.f6674C = null;
        this.f6673B = i8;
        ImageView imageView = this.f6675D;
        if (imageView != null) {
            if (i8 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f6675D.setImageResource(this.f6673B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f6674C = drawable;
        this.f6673B = 0;
        ImageView imageView = this.f6675D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f6675D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f6696f = charSequence;
        TextView textView = this.f6677F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f6695e = charSequence;
        TextView textView = this.f6676E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i8) {
        this.f6698h = null;
        this.f6699i = i8;
        this.f6704n = false;
    }

    public void r(View view) {
        this.f6698h = view;
        this.f6699i = 0;
        this.f6704n = false;
    }

    public void s(View view, int i8, int i9, int i10, int i11) {
        this.f6698h = view;
        this.f6699i = 0;
        this.f6704n = true;
        this.f6700j = i8;
        this.f6701k = i9;
        this.f6702l = i10;
        this.f6703m = i11;
    }
}
