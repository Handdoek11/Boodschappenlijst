package com.headcode.ourgroceries.android;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.adadapted.android.sdk.core.ad.AdActionType;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.headcode.ourgroceries.android.view.TourImageView;
import e.AbstractC5734a;
import n5.C6270t;
import n5.C6271u;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class TourActivity extends AbstractActivityC5575j2 {

    /* renamed from: S, reason: collision with root package name */
    private static final f[] f34509S;

    /* renamed from: O, reason: collision with root package name */
    private e f34510O;

    /* renamed from: P, reason: collision with root package name */
    private final androidx.activity.u f34511P = new a(false);

    /* renamed from: Q, reason: collision with root package name */
    private final ViewPager2.i f34512Q = new b();

    /* renamed from: R, reason: collision with root package name */
    private C6270t f34513R;

    class a extends androidx.activity.u {
        a(boolean z7) {
            super(z7);
        }

        @Override // androidx.activity.u
        public void d() {
            TourActivity.this.f34510O.k0();
        }
    }

    class b extends ViewPager2.i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i8) {
            s5.W P12 = TourActivity.P1(i8);
            if (A2.f33140n0.r() != P12) {
                A2.f33140n0.r0(P12);
                TourActivity.this.Y0().J0();
            }
            TourActivity.this.O1("tourPage", i8, null);
            boolean z7 = i8 == 0;
            TourActivity.this.f34513R.f39741c.animate().alpha(z7 ? 0.1f : 0.9f).setDuration(250L);
            TourActivity.this.f34511P.j(!z7);
        }
    }

    public static class c extends AbstractC5734a {
        @Override // e.AbstractC5734a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, Void r32) {
            return new Intent(context, (Class<?>) TourActivity.class);
        }

        @Override // e.AbstractC5734a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public d c(int i8, Intent intent) {
            return i8 != 0 ? i8 != 1 ? d.COMPLETED : d.SKIPPED : d.BACK_OUT;
        }
    }

    public enum d {
        BACK_OUT,
        SKIPPED,
        COMPLETED
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e extends RecyclerView.h {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f0(View view) {
            h0("genericTap");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g0(View view) {
            TourActivity.this.J1(false, "startButton");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int E() {
            return TourActivity.f34509S.length;
        }

        public void h0(String str) {
            int currentItem = TourActivity.this.f34513R.f39744f.getCurrentItem();
            if (currentItem < E() - 1) {
                TourActivity.this.f34513R.f39744f.setCurrentItem(currentItem + 1);
            } else {
                TourActivity.this.J1(false, str);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public void S(g gVar, int i8) {
            gVar.g0(TourActivity.f34509S[i8]);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public g U(ViewGroup viewGroup, int i8) {
            C6271u c8 = C6271u.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            c8.b().setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.Z4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34636o.f0(view);
                }
            });
            c8.f39746b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.a5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34652o.g0(view);
                }
            });
            return new g(c8);
        }

        public void k0() {
            int currentItem = TourActivity.this.f34513R.f39744f.getCurrentItem();
            if (currentItem > 0) {
                TourActivity.this.f34513R.f39744f.setCurrentItem(currentItem - 1);
            }
        }

        /* synthetic */ e(TourActivity tourActivity, a aVar) {
            this();
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f34521a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34522b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34523c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34524d;

        /* renamed from: e, reason: collision with root package name */
        public final TourImageView.a f34525e;

        /* synthetic */ f(int i8, int i9, int i10, int i11, TourImageView.a aVar, a aVar2) {
            this(i8, i9, i10, i11, aVar);
        }

        private f(int i8, int i9, int i10, int i11, TourImageView.a aVar) {
            this.f34521a = i8;
            this.f34522b = i9;
            this.f34523c = i10;
            this.f34524d = i11;
            this.f34525e = aVar;
        }
    }

    private static class g extends RecyclerView.F {

        /* renamed from: u, reason: collision with root package name */
        private final C6271u f34526u;

        public g(C6271u c6271u) {
            super(c6271u.b());
            this.f34526u = c6271u;
        }

        private Bitmap h0(int i8) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 1;
            options.inTargetDensity = 1;
            options.inSampleSize = 1;
            try {
                return BitmapFactory.decodeResource(OurApplication.f34286H.getResources(), i8, options);
            } catch (OutOfMemoryError unused) {
                AbstractC6635a.b("OG-Tour", "OOM with sample 1");
                options.inSampleSize = 2;
                try {
                    return BitmapFactory.decodeResource(OurApplication.f34286H.getResources(), i8, options);
                } catch (OutOfMemoryError unused2) {
                    AbstractC6635a.b("OG-Tour", "OOM with sample 2");
                    return null;
                }
            }
        }

        public void g0(f fVar) {
            this.f34526u.f39749e.setText(fVar.f34521a);
            this.f34526u.f39748d.setText(fVar.f34522b);
            Bitmap h02 = h0(fVar.f34523c);
            if (h02 == null) {
                this.f34526u.f39747c.setVisibility(8);
            } else {
                this.f34526u.f39747c.setVisibility(0);
                View view = this.f34526u.f39747c;
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageBitmap(h02);
                }
                View view2 = this.f34526u.f39747c;
                if (view2 instanceof TourImageView) {
                    ((TourImageView) view2).setMode(fVar.f34525e);
                }
            }
            if (fVar.f34524d == -1) {
                this.f34526u.f39746b.setVisibility(8);
            } else {
                this.f34526u.f39746b.setVisibility(0);
                this.f34526u.f39746b.setText(fVar.f34524d);
            }
        }
    }

    static {
        int i8 = M2.f33950P5;
        int i9 = M2.f33942O5;
        int i10 = G2.f33467o;
        TourImageView.a aVar = TourImageView.a.FIT_HORIZONTALLY;
        f fVar = new f(i8, i9, i10, -1, aVar, null);
        int i11 = M2.f33966R5;
        int i12 = M2.f33958Q5;
        int i13 = G2.f33464l;
        TourImageView.a aVar2 = TourImageView.a.FIT_VERTICALLY;
        a aVar3 = null;
        int i14 = -1;
        f34509S = new f[]{fVar, new f(i11, i12, i13, i14, aVar2, aVar3), new f(M2.f33982T5, M2.f33974S5, G2.f33465m, -1, aVar2, null), new f(M2.f33998V5, M2.f33990U5, G2.f33466n, i14, aVar, aVar3), new f(M2.f34022Y5, M2.f34014X5, G2.f33463k, M2.f34006W5, aVar, aVar3)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(boolean z7, String str) {
        O1(z7 ? "tourSkipped" : "tourComplete", this.f34513R.f39744f.getCurrentItem(), str);
        setResult(z7 ? 1 : 2);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1(TabLayout.e eVar, int i8) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(View view) {
        if (this.f34513R.f39744f.getCurrentItem() < this.f34510O.E() - 1) {
            J1(true, null);
        } else {
            J1(false, "skipButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(View view) {
        this.f34510O.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1(View view) {
        this.f34510O.h0("nextButton");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1(String str, int i8, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("tourPageReference", AdActionType.POPUP + (i8 + 1));
        if (str2 != null) {
            bundle.putString("actionSource", str2);
        }
        AbstractC5673x.b(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s5.W P1(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? s5.W.UNKNOWN_SCREEN : s5.W.TOUR_5 : s5.W.TOUR_4 : s5.W.TOUR_3 : s5.W.TOUR_2 : s5.W.TOUR_1;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected boolean H0() {
        return false;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        C6270t c8 = C6270t.c(getLayoutInflater());
        this.f34513R = c8;
        setContentView(c8.b());
        e eVar = new e(this, null);
        this.f34510O = eVar;
        this.f34513R.f39744f.setAdapter(eVar);
        this.f34513R.f39744f.g(this.f34512Q);
        C6270t c6270t = this.f34513R;
        new com.google.android.material.tabs.d(c6270t.f39743e, c6270t.f39744f, new d.b() { // from class: com.headcode.ourgroceries.android.V4
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.e eVar2, int i8) {
                TourActivity.K1(eVar2, i8);
            }
        }).a();
        this.f34513R.f39742d.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.W4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34584o.L1(view);
            }
        });
        this.f34513R.f39741c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.X4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34599o.M1(view);
            }
        });
        this.f34513R.f39740b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.Y4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34613o.N1(view);
            }
        });
        this.f34513R.f39741c.setAlpha(0.1f);
        getOnBackPressedDispatcher().h(this, this.f34511P);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        this.f34513R.f39744f.n(this.f34512Q);
        super.onDestroy();
    }
}
