package com.headcode.ourgroceries.android;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.bumptech.glide.load.engine.GlideException;
import com.headcode.ourgroceries.android.C5643s4;
import com.headcode.ourgroceries.android.view.CapsuleView;
import com.headcode.ourgroceries.android.view.OverstrikeTextView;
import f.AbstractC5752a;
import i5.C5871k;
import i5.InterfaceC5864d;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import k5.AbstractC6107a;
import k5.C6108b;
import k5.C6109c;
import l5.AbstractC6175a;
import o0.AbstractC6278a;
import p5.C6395a;
import q5.AbstractC6635a;
import t5.AbstractC6803e;

/* renamed from: com.headcode.ourgroceries.android.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5536e3 extends RecyclerView.h implements InterfaceC5864d, j5.g {

    /* renamed from: d, reason: collision with root package name */
    private final Context f34690d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f34691e;

    /* renamed from: f, reason: collision with root package name */
    private final d f34692f;

    /* renamed from: g, reason: collision with root package name */
    private final R2 f34693g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34694h = false;

    /* renamed from: i, reason: collision with root package name */
    private final Map f34695i = new HashMap(128);

    /* renamed from: j, reason: collision with root package name */
    private long f34696j = 1;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f34697k = null;

    /* renamed from: l, reason: collision with root package name */
    private C6395a f34698l = new C6395a(0);

    /* renamed from: com.headcode.ourgroceries.android.e3$a */
    class a implements Z1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f34699a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34700b;

        a(g gVar, String str) {
            this.f34699a = gVar;
            this.f34700b = str;
        }

        @Override // Z1.e
        public boolean b(GlideException glideException, Object obj, a2.h hVar, boolean z7) {
            AbstractC5673x.a("photoErrorList");
            return false;
        }

        @Override // Z1.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean a(Drawable drawable, Object obj, a2.h hVar, J1.a aVar, boolean z7) {
            this.f34699a.f34723Q = this.f34700b;
            return false;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.e3$b */
    class b extends k5.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34702b;

        b(int i8) {
            this.f34702b = i8;
        }

        @Override // k5.AbstractC6107a
        protected void c() {
            C5536e3.this.f34692f.O(C5536e3.this.f34698l, this.f34702b);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.e3$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34704a;

        static {
            int[] iArr = new int[s5.r0.values().length];
            f34704a = iArr;
            try {
                iArr[s5.r0.STAR_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34704a[s5.r0.STAR_YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.e3$d */
    public interface d {

        /* renamed from: com.headcode.ourgroceries.android.e3$d$a */
        public enum a {
            NONE,
            CROSS_OFF
        }

        int A(C6395a c6395a, int i8, Z0 z02);

        String D(C6395a c6395a, int i8, Object obj);

        boolean E(Object obj);

        boolean F(C6395a c6395a, int i8, Z0 z02);

        int G(C6395a c6395a, int i8, Object obj);

        void H();

        boolean J(int i8);

        void K(g gVar, Object obj);

        void L();

        a M();

        String N(C6395a c6395a, int i8, String str);

        void O(C6395a c6395a, int i8);

        String b(C6395a c6395a, int i8, Z0 z02);

        void g(Object obj);

        boolean m(C6395a c6395a, int i8, String str);

        void r(Object obj, boolean z7);

        boolean s(C6395a c6395a, g gVar, int i8, Object obj);

        void t(C6395a c6395a, int i8, int i9);

        void v(Object obj);

        void z(Object obj, ContextMenu contextMenu);
    }

    /* renamed from: com.headcode.ourgroceries.android.e3$e */
    private static class e extends f.b {

        /* renamed from: a, reason: collision with root package name */
        private final d f34708a;

        /* renamed from: b, reason: collision with root package name */
        private final C6395a f34709b;

        /* renamed from: c, reason: collision with root package name */
        private final C6395a f34710c;

        public e(d dVar, C6395a c6395a, C6395a c6395a2) {
            this.f34708a = dVar;
            this.f34709b = c6395a;
            this.f34710c = c6395a2;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean a(int i8, int i9) {
            Object g8 = this.f34709b.g(i8);
            Object g9 = this.f34710c.g(i9);
            if ((g8 instanceof Z0) && (g9 instanceof Z0)) {
                return ((Z0) g8).a0((Z0) g9);
            }
            if ((g8 instanceof p5.e) && (g9 instanceof p5.e)) {
                p5.e eVar = (p5.e) g8;
                p5.e eVar2 = (p5.e) g9;
                return Objects.equals(eVar.d(), eVar2.d()) && eVar.a() == eVar2.a();
            }
            if ((g8 instanceof p5.c) && (g9 instanceof p5.c)) {
                return Objects.equals(((p5.c) g8).c(), ((p5.c) g9).c());
            }
            if ((g8 instanceof p5.g) && (g9 instanceof p5.g)) {
                return Objects.equals(((p5.g) g8).b(), ((p5.g) g9).b());
            }
            AbstractC5673x.a("diffError");
            return false;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean b(int i8, int i9) {
            d dVar = this.f34708a;
            C6395a c6395a = this.f34709b;
            String D7 = dVar.D(c6395a, i8, c6395a.g(i8));
            d dVar2 = this.f34708a;
            C6395a c6395a2 = this.f34710c;
            return D7.equals(dVar2.D(c6395a2, i9, c6395a2.g(i9)));
        }

        @Override // androidx.recyclerview.widget.f.b
        public int d() {
            return this.f34710c.h();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int e() {
            return this.f34709b.h();
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.e3$f */
    public class f implements C5643s4.a {
        public f() {
        }

        private boolean c(int i8) {
            return C5536e3.p0(C5536e3.this.G(i8));
        }

        @Override // com.headcode.ourgroceries.android.C5643s4.a
        public boolean a(int i8) {
            return !c(i8);
        }

        @Override // com.headcode.ourgroceries.android.C5643s4.a
        public boolean b(int i8) {
            return !c(i8) && (i8 == C5536e3.this.E() - 1 || !c(i8 + 1));
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.e3$g */
    public static final class g extends AbstractC6175a {

        /* renamed from: F, reason: collision with root package name */
        public final TextView f34712F;

        /* renamed from: G, reason: collision with root package name */
        public final TextView f34713G;

        /* renamed from: H, reason: collision with root package name */
        public final ImageView f34714H;

        /* renamed from: I, reason: collision with root package name */
        public final ImageView f34715I;

        /* renamed from: J, reason: collision with root package name */
        public final ImageButton f34716J;

        /* renamed from: K, reason: collision with root package name */
        public final View f34717K;

        /* renamed from: L, reason: collision with root package name */
        public final CapsuleView f34718L;

        /* renamed from: M, reason: collision with root package name */
        public final View f34719M;

        /* renamed from: N, reason: collision with root package name */
        private final View f34720N;

        /* renamed from: O, reason: collision with root package name */
        public final CheckBox f34721O;

        /* renamed from: P, reason: collision with root package name */
        public Object f34722P;

        /* renamed from: Q, reason: collision with root package name */
        public String f34723Q;

        public g(View view) {
            super(view);
            this.f34712F = (TextView) view.findViewById(R.id.text1);
            this.f34713G = (TextView) view.findViewById(R.id.text2);
            this.f34714H = (ImageView) view.findViewById(H2.f33488B0);
            this.f34715I = (ImageView) view.findViewById(H2.f33485A0);
            this.f34716J = (ImageButton) view.findViewById(H2.f33585j);
            this.f34717K = view.findViewById(H2.f33491C0);
            this.f34718L = (CapsuleView) view.findViewById(H2.f33511J);
            this.f34719M = view.findViewById(H2.f33544U);
            this.f34723Q = null;
            this.f34720N = view.findViewById(H2.f33523N);
            this.f34721O = (CheckBox) view.findViewById(H2.f33520M);
        }

        @Override // j5.i
        public View g() {
            View view = this.f34720N;
            if (view != null) {
                return view;
            }
            throw new AssertionError();
        }

        public Object g0() {
            return this.f34722P;
        }

        public void h0(Object obj) {
            this.f34722P = obj;
        }
    }

    public C5536e3(Context context, d dVar) {
        this.f34690d = context;
        this.f34691e = LayoutInflater.from(context);
        this.f34692f = dVar;
        this.f34693g = new R2(context.getApplicationContext());
        b0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean p0(int i8) {
        return i8 == 0 || i8 == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(g gVar, View view) {
        this.f34692f.K(gVar, gVar.g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(g gVar, View view) {
        this.f34692f.g(gVar.g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(g gVar, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f34692f.z(gVar.g0(), contextMenu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean t0(g gVar, View view) {
        return this.f34692f.E(gVar.g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(g gVar, View view) {
        this.f34692f.v(gVar.g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(g gVar, CompoundButton compoundButton, boolean z7) {
        this.f34692f.r(gVar.g0(), z7);
    }

    @Override // j5.g
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public int w(g gVar, int i8, int i9, int i10) {
        return (gVar.F() == 3 && this.f34692f.M().ordinal() == 1) ? 8194 : 0;
    }

    @Override // j5.g
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void s(g gVar, int i8, int i9) {
        if (i9 == 1) {
            gVar.f10944a.setBackgroundResource(G2.f33453a);
        } else if (i9 != 3) {
            gVar.f10944a.setBackground(null);
        } else {
            gVar.f10944a.setBackgroundResource(G2.f33454b);
        }
    }

    @Override // j5.g
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public AbstractC6107a b(g gVar, int i8, int i9) {
        return (i9 == 2 || i9 == 4) ? this.f34692f.M().ordinal() != 1 ? new C6109c() : new b(i8) : new C6108b();
    }

    @Override // j5.g
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void n(g gVar, int i8) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int E() {
        return this.f34698l.h();
    }

    public void E0(Drawable drawable) {
        this.f34697k = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long F(int i8) {
        if (!P1.D()) {
            throw new AssertionError("must call getItemId() on main thread");
        }
        String D7 = this.f34692f.D(this.f34698l, i8, n0(i8));
        Long l8 = (Long) this.f34695i.get(D7);
        if (l8 == null) {
            long j8 = this.f34696j;
            this.f34696j = 1 + j8;
            l8 = Long.valueOf(j8);
            this.f34695i.put(D7, l8);
        }
        return l8.longValue();
    }

    public void F0(boolean z7) {
        this.f34694h = z7;
        N(0, E());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int G(int i8) {
        return this.f34692f.G(this.f34698l, i8, n0(i8));
    }

    public void G0(C6395a c6395a, boolean z7) {
        if (!z7) {
            this.f34698l = c6395a;
            J();
            return;
        }
        e eVar = new e(this.f34692f, this.f34698l, c6395a);
        SystemClock.elapsedRealtime();
        f.e b8 = androidx.recyclerview.widget.f.b(eVar);
        SystemClock.elapsedRealtime();
        this.f34698l = c6395a;
        b8.c(this);
    }

    @Override // i5.InterfaceC5864d
    public void i(int i8, int i9) {
        AbstractC6635a.d("OG-SectListRecAdapter", "onMoveItem(" + i8 + ", " + i9 + ")");
        this.f34692f.t(this.f34698l, i8, i9);
    }

    public void m0(Activity activity) {
        Drawable e8 = AbstractC6278a.e(activity, G2.f33458f);
        if (e8 != null) {
            P1.Z(e8, P1.w(activity.getTheme(), AbstractC5752a.f35390q, 16777215));
            E0(e8);
        }
    }

    public Object n0(int i8) {
        return this.f34698l.g(i8);
    }

    public boolean o0() {
        return this.f34694h;
    }

    @Override // i5.InterfaceC5864d
    public void q(int i8) {
        AbstractC6635a.d("OG-SectListRecAdapter", "onItemDragStarted(" + i8 + ")");
        this.f34692f.H();
    }

    @Override // i5.InterfaceC5864d
    public void v(int i8, int i9, boolean z7) {
        AbstractC6635a.d("OG-SectListRecAdapter", "onItemDragFinished(" + i8 + ", " + i9 + ", " + z7 + ")");
        this.f34692f.L();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void S(g gVar, int i8) {
        String b8;
        Object n02 = n0(i8);
        gVar.h0(n02);
        if (this.f34692f.s(this.f34698l, gVar, i8, n02)) {
            return;
        }
        TextView textView = gVar.f34713G;
        if (textView != null) {
            textView.setText("");
            gVar.f34713G.setVisibility(8);
        }
        TextView textView2 = gVar.f34712F;
        if (textView2 instanceof OverstrikeTextView) {
            ((OverstrikeTextView) textView2).setDrawOverstrike(false);
        }
        View view = gVar.f34719M;
        if (view != null && !(n02 instanceof Z0)) {
            view.setVisibility(8);
        }
        if (n02 instanceof p5.c) {
            p5.c cVar = (p5.c) n02;
            gVar.f34712F.setText(cVar.c());
            TextView textView3 = gVar.f34712F;
            if (textView3 instanceof OverstrikeTextView) {
                ((OverstrikeTextView) textView3).setDrawOverstrike(cVar.d());
                return;
            }
            return;
        }
        this.f34693g.c(gVar.f34712F, gVar.f34714H, gVar.f34715I, gVar.f34717K);
        if (!(n02 instanceof Z0)) {
            if (n02 instanceof p5.e) {
                p5.e eVar = (p5.e) n02;
                gVar.f34712F.setText(eVar.d());
                TextView textView4 = gVar.f34712F;
                if ((textView4 instanceof CheckedTextView) && this.f34697k != null) {
                    CheckedTextView checkedTextView = (CheckedTextView) textView4;
                    boolean m8 = this.f34692f.m(this.f34698l, i8, eVar.b());
                    checkedTextView.setCheckMarkDrawable(m8 ? this.f34697k : null);
                    checkedTextView.setChecked(m8);
                }
                CapsuleView capsuleView = gVar.f34718L;
                if (capsuleView != null) {
                    capsuleView.setText(String.valueOf(eVar.a()));
                    return;
                }
                return;
            }
            if (n02 instanceof p5.g) {
                gVar.f34712F.setText(((p5.g) n02).b());
                return;
            }
            if (n02 instanceof p5.f) {
                gVar.f34712F.setText(((p5.f) n02).b());
                return;
            }
            if (!(n02 instanceof String)) {
                throw new AssertionError("Unknown object at position " + i8 + ": " + n02);
            }
            String str = (String) n02;
            gVar.f34712F.setText(str);
            if (gVar.f34713G != null) {
                String N7 = this.f34692f.N(this.f34698l, i8, str);
                if (AbstractC6803e.o(N7)) {
                    return;
                }
                gVar.f34713G.setText(N7);
                gVar.f34713G.setVisibility(0);
                return;
            }
            return;
        }
        Z0 z02 = (Z0) n02;
        gVar.f34712F.setText(z02.E());
        TextView textView5 = gVar.f34712F;
        if ((textView5 instanceof CheckedTextView) && this.f34697k != null) {
            CheckedTextView checkedTextView2 = (CheckedTextView) textView5;
            boolean F7 = this.f34692f.F(this.f34698l, i8, z02);
            checkedTextView2.setCheckMarkDrawable(F7 ? this.f34697k : null);
            checkedTextView2.setChecked(F7);
        }
        TextView textView6 = gVar.f34712F;
        if (textView6 instanceof OverstrikeTextView) {
            ((OverstrikeTextView) textView6).setDrawOverstrike(z02.P());
        }
        if (gVar.f34713G != null && (b8 = this.f34692f.b(this.f34698l, i8, z02)) != null && !b8.isEmpty()) {
            gVar.f34713G.setText(b8);
            gVar.f34713G.setVisibility(0);
        }
        if (gVar.f34714H != null) {
            int i9 = c.f34704a[z02.C().ordinal()];
            if (i9 == 1) {
                gVar.f34714H.setVisibility(8);
            } else if (i9 == 2) {
                gVar.f34714H.setVisibility(0);
            }
        }
        CheckBox checkBox = gVar.f34721O;
        if (checkBox != null) {
            checkBox.setChecked(this.f34692f.F(this.f34698l, i8, z02));
        }
        if (gVar.f34715I != null) {
            String A7 = z02.A();
            if (A7.equals("") || A7.equals("photo")) {
                gVar.f34715I.setImageBitmap(null);
                gVar.f34715I.setVisibility(8);
                gVar.f34723Q = null;
            } else if (!A7.equals(gVar.f34723Q)) {
                gVar.f34715I.setImageBitmap(null);
                gVar.f34715I.setVisibility(0);
                gVar.f34723Q = null;
                ((com.bumptech.glide.j) AbstractC5648t2.c(this.f34690d, A7).n0(new com.bumptech.glide.load.resource.bitmap.l(), new com.bumptech.glide.load.resource.bitmap.F(P1.i(5)))).C0(new a(gVar, A7)).x0(new C5557h0(gVar.f34715I));
            }
        }
        View view2 = gVar.f34719M;
        if (view2 != null) {
            view2.setVisibility((!this.f34694h || z02.P()) ? 8 : 0);
        }
    }

    @Override // i5.InterfaceC5864d
    public boolean x(int i8, int i9) {
        p5.d e8 = this.f34698l.e(i9);
        if (e8 == null) {
            return false;
        }
        return this.f34698l.c(e8.b()).f();
    }

    @Override // i5.InterfaceC5864d
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public boolean o(g gVar, int i8, int i9, int i10) {
        View view = gVar.f34719M;
        if (view == null || view.getVisibility() == 8) {
            return false;
        }
        int[] iArr = new int[2];
        gVar.f10944a.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        gVar.f34719M.getLocationOnScreen(iArr2);
        int i11 = i9 + (iArr[0] - iArr2[0]);
        int width = view.getWidth();
        view.getHeight();
        return i11 > (-width) && i11 < width * 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public g U(ViewGroup viewGroup, int i8) {
        int i9;
        switch (i8) {
            case 0:
                i9 = J2.f33721x;
                break;
            case 1:
                i9 = J2.f33715r;
                break;
            case 2:
                i9 = J2.f33719v;
                break;
            case 3:
                i9 = J2.f33720w;
                break;
            case 4:
                i9 = J2.f33681K;
                break;
            case 5:
                i9 = J2.f33684N;
                break;
            case 6:
                i9 = J2.f33700c;
                break;
            case 7:
                i9 = J2.f33680J;
                break;
            case 8:
                i9 = J2.f33717t;
                break;
            case 9:
                i9 = J2.f33676F;
                break;
            default:
                throw new AssertionError();
        }
        View inflate = this.f34691e.inflate(i9, viewGroup, false);
        final g gVar = new g(inflate);
        if (!p0(i8)) {
            if (i8 != 1 && (inflate = gVar.f34717K) == null) {
                inflate = gVar.f34712F;
            }
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.Y2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34607o.q0(gVar, view);
                }
            });
            ImageView imageView = gVar.f34715I;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.Z2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f34633o.r0(gVar, view);
                    }
                });
            }
            if (this.f34692f.J(i8)) {
                inflate.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() { // from class: com.headcode.ourgroceries.android.a3
                    @Override // android.view.View.OnCreateContextMenuListener
                    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                        this.f34648o.s0(gVar, contextMenu, view, contextMenuInfo);
                    }
                });
            } else {
                inflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.headcode.ourgroceries.android.b3
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f34657o.t0(gVar, view);
                    }
                });
            }
            ImageButton imageButton = gVar.f34716J;
            if (imageButton != null) {
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.c3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f34669o.u0(gVar, view);
                    }
                });
            }
            CheckBox checkBox = gVar.f34721O;
            if (checkBox != null) {
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.headcode.ourgroceries.android.d3
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                        this.f34678a.v0(gVar, compoundButton, z7);
                    }
                });
            }
        }
        return gVar;
    }

    @Override // i5.InterfaceC5864d
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C5871k z(g gVar, int i8) {
        AbstractC6635a.d("OG-SectListRecAdapter", "onGetItemDraggableRange()");
        int d8 = this.f34698l.d();
        if (d8 == 0) {
            return null;
        }
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < d8; i11++) {
            p5.b c8 = this.f34698l.c(i11);
            if (c8.f()) {
                if (i9 == -1) {
                    i9 = c8.a();
                }
                i10 = c8.b() - 1;
            }
        }
        if (i9 == -1 || i10 == -1) {
            return null;
        }
        return new C5871k(i9, i10);
    }
}
