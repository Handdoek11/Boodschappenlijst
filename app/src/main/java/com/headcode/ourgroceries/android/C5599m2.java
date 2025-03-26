package com.headcode.ourgroceries.android;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.OurAppWidgetProvider;
import com.headcode.ourgroceries.android.R4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import q5.AbstractC6635a;

/* renamed from: com.headcode.ourgroceries.android.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5599m2 implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a, reason: collision with root package name */
    private final OurApplication f34894a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f34895b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34896c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f34897d;

    /* renamed from: e, reason: collision with root package name */
    private List f34898e = Collections.emptyList();

    /* renamed from: com.headcode.ourgroceries.android.m2$a */
    private static abstract class a implements g {

        /* renamed from: a, reason: collision with root package name */
        protected final boolean f34899a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34900b;

        /* renamed from: c, reason: collision with root package name */
        private final int f34901c;

        /* renamed from: d, reason: collision with root package name */
        private final Intent f34902d;

        public a(boolean z7, int i8, int i9, Intent intent) {
            this.f34899a = z7;
            this.f34900b = i8;
            this.f34901c = i9;
            this.f34902d = intent;
        }

        protected void b(RemoteViews remoteViews, int i8) {
            Intent intent = this.f34902d;
            if (intent != null) {
                remoteViews.setOnClickFillInIntent(i8, intent);
            }
        }

        protected void c(RemoteViews remoteViews) {
            if (this.f34899a) {
                return;
            }
            int i8 = this.f34900b;
            if (i8 != 0) {
                remoteViews.setTextColor(R.id.text1, i8);
            }
            int i9 = this.f34901c;
            if (i9 != 0) {
                remoteViews.setInt(R.id.text1, "setBackgroundColor", i9);
            }
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$b */
    private class b extends h {
        public b(String str, boolean z7, int i8, int i9, Intent intent) {
            super(str, z7 ? J2.f33706i : J2.f33704g, z7, i8, i9, intent);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$c */
    private class c implements g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34904a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34905b;

        public c(boolean z7, int i8) {
            this.f34904a = z7;
            this.f34905b = i8;
        }

        @Override // com.headcode.ourgroceries.android.C5599m2.g
        public RemoteViews a() {
            RemoteViews remoteViews = new RemoteViews(C5599m2.this.f34895b.getPackageName(), this.f34904a ? J2.f33707j : J2.f33711n);
            if (!this.f34904a) {
                remoteViews.setInt(H2.f33608q1, "setBackgroundColor", this.f34905b);
            }
            return remoteViews;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$d */
    private class d extends a {

        /* renamed from: e, reason: collision with root package name */
        private final Z0 f34907e;

        public d(Z0 z02, boolean z7, int i8, int i9) {
            super(z7, i8, i9, new Intent().putExtra("com.headcode.ourgroceries.ItemID", z02.w()));
            this.f34907e = z02;
        }

        @Override // com.headcode.ourgroceries.android.C5599m2.g
        public RemoteViews a() {
            RemoteViews remoteViews = new RemoteViews(C5599m2.this.f34895b.getPackageName(), this.f34899a ? J2.f33710m : J2.f33714q);
            remoteViews.setTextViewText(R.id.text1, this.f34907e.E());
            remoteViews.setInt(R.id.text1, "setPaintFlags", this.f34907e.P() ? 17 : 1);
            c(remoteViews);
            b(remoteViews, R.id.text1);
            return remoteViews;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$e */
    private class e extends h {
        public e(String str, boolean z7, int i8, int i9) {
            super(str, z7 ? J2.f33709l : J2.f33713p, z7, i8, i9, null);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$f */
    private class f extends h {
        public f(String str, boolean z7, int i8, int i9) {
            super(str, z7 ? J2.f33708k : J2.f33712o, z7, i8, i9, null);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$g */
    private interface g {
        RemoteViews a();
    }

    /* renamed from: com.headcode.ourgroceries.android.m2$h */
    private abstract class h extends a {

        /* renamed from: e, reason: collision with root package name */
        private final String f34911e;

        /* renamed from: f, reason: collision with root package name */
        private final int f34912f;

        public h(String str, int i8, boolean z7, int i9, int i10, Intent intent) {
            super(z7, i9, i10, intent);
            this.f34911e = str;
            this.f34912f = i8;
        }

        @Override // com.headcode.ourgroceries.android.C5599m2.g
        public RemoteViews a() {
            RemoteViews remoteViews = new RemoteViews(C5599m2.this.f34895b.getPackageName(), this.f34912f);
            remoteViews.setTextViewText(R.id.text1, this.f34911e);
            b(remoteViews, R.id.text1);
            c(remoteViews);
            return remoteViews;
        }
    }

    public C5599m2(OurApplication ourApplication, Context context, Intent intent) {
        this.f34894a = ourApplication;
        this.f34895b = context;
        this.f34896c = intent.getIntExtra("appWidgetId", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(CountDownLatch countDownLatch) {
        try {
            d();
        } finally {
            countDownLatch.countDown();
        }
    }

    private void d() {
        boolean z7;
        this.f34898e = Collections.emptyList();
        OurAppWidgetProvider.a i8 = OurAppWidgetProvider.i(this.f34894a, this.f34896c);
        if (i8.f34284b) {
            OurAppWidgetProvider.k(this.f34895b, AppWidgetManager.getInstance(this.f34894a), this.f34896c);
        }
        C5688z0 c5688z0 = i8.f34283a;
        if (c5688z0 == null) {
            AbstractC6635a.f("OG-WidgetRows", "onDataSetChanged(): can't find list");
            return;
        }
        this.f34898e = new ArrayList(c5688z0.size());
        C5574j1 i9 = this.f34894a.i();
        B0 e8 = B0.e(i9.D());
        B0 f8 = B0.f(i9);
        Iterator it = c5688z0.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z02.P()) {
                f8.a(z02);
            } else {
                e8.a(z02);
            }
        }
        R4.b d8 = R4.d(this.f34895b);
        boolean w7 = d8.w();
        Resources.Theme newTheme = this.f34895b.getResources().newTheme();
        newTheme.applyStyle(d8.v(), true);
        int color = this.f34895b.getColor(d8.q());
        int color2 = this.f34895b.getColor(d8.l());
        int color3 = this.f34895b.getColor(d8.k());
        int color4 = this.f34895b.getColor(d8.r());
        int w8 = P1.w(newTheme, C2.f33317h, 0);
        int w9 = P1.w(newTheme, C2.f33316g, 0);
        int w10 = P1.w(newTheme, C2.f33314e, 0);
        boolean z8 = false;
        for (C5565i0 c5565i0 : e8.d()) {
            if (c5565i0.g()) {
                this.f34898e.add(new f(((Z0) c5565i0.a()).E(), w7, color2, color3));
                z8 = false;
            }
            Iterator it2 = c5565i0.c().iterator();
            while (it2.hasNext()) {
                Z0 z03 = (Z0) it2.next();
                if (z8) {
                    this.f34898e.add(new c(w7, color4));
                }
                this.f34898e.add(new d(z03, w7, color, 0));
                it2 = it2;
                z8 = true;
            }
        }
        Intent putExtra = new Intent().putExtra("com.headcode.ourgroceries.ListAction", AbstractC5625q.b.ADD_ITEM.name());
        if (z8) {
            this.f34898e.add(new c(w7, color4));
        }
        this.f34898e.add(new b(this.f34895b.getString(M2.f34233z0), w7, w10, 0, putExtra));
        List<C5565i0> d9 = f8.d();
        if (d9.isEmpty()) {
            z7 = true;
        } else {
            this.f34898e.add(new e(this.f34895b.getString(M2.f33825A0), w7, w8, w9));
            boolean z9 = false;
            for (C5565i0 c5565i02 : d9) {
                if (c5565i02.g()) {
                    this.f34898e.add(new f(((Z0) c5565i02.a()).E(), w7, color2, color3));
                    z9 = false;
                }
                for (Z0 z04 : c5565i02.c()) {
                    if (z9) {
                        this.f34898e.add(new c(w7, color4));
                    }
                    this.f34898e.add(new d(z04, w7, color, 0));
                    z9 = true;
                }
            }
            z7 = z9;
        }
        if (z7) {
            this.f34898e.add(new c(w7, color4));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.f34898e.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int i8) {
        if (i8 < getCount()) {
            return ((g) this.f34898e.get(i8)).a();
        }
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 10;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        this.f34897d = new Handler(Looper.getMainLooper());
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            d();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f34897d.post(new Runnable() { // from class: com.headcode.ourgroceries.android.l2
            @Override // java.lang.Runnable
            public final void run() {
                this.f34881o.c(countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
