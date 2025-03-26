package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import n0.AbstractC6243b;

/* loaded from: classes.dex */
public abstract class k {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f9100a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f9101b;

        /* renamed from: c, reason: collision with root package name */
        private final r[] f9102c;

        /* renamed from: d, reason: collision with root package name */
        private final r[] f9103d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9104e;

        /* renamed from: f, reason: collision with root package name */
        boolean f9105f;

        /* renamed from: g, reason: collision with root package name */
        private final int f9106g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f9107h;

        /* renamed from: i, reason: collision with root package name */
        public int f9108i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f9109j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f9110k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f9111l;

        public a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i8 != 0 ? IconCompat.c(null, "", i8) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f9110k;
        }

        public boolean b() {
            return this.f9104e;
        }

        public Bundle c() {
            return this.f9100a;
        }

        public IconCompat d() {
            int i8;
            if (this.f9101b == null && (i8 = this.f9108i) != 0) {
                this.f9101b = IconCompat.c(null, "", i8);
            }
            return this.f9101b;
        }

        public r[] e() {
            return this.f9102c;
        }

        public int f() {
            return this.f9106g;
        }

        public boolean g() {
            return this.f9105f;
        }

        public CharSequence h() {
            return this.f9109j;
        }

        public boolean i() {
            return this.f9111l;
        }

        public boolean j() {
            return this.f9107h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z7, int i8, boolean z8, boolean z9, boolean z10) {
            this.f9105f = true;
            this.f9101b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f9108i = iconCompat.e();
            }
            this.f9109j = e.d(charSequence);
            this.f9110k = pendingIntent;
            this.f9100a = bundle == null ? new Bundle() : bundle;
            this.f9102c = rVarArr;
            this.f9103d = rVarArr2;
            this.f9104e = z7;
            this.f9106g = i8;
            this.f9105f = z8;
            this.f9107h = z9;
            this.f9111l = z10;
        }
    }

    public static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f9112e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f9113f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9114g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f9115h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f9116i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.k$b$b, reason: collision with other inner class name */
        private static class C0154b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z7) {
                bigPictureStyle.showBigPictureWhenCollapsed(z7);
            }
        }

        @Override // androidx.core.app.k.f
        public void b(j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.f9166b);
            IconCompat iconCompat = this.f9112e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0154b.a(bigContentTitle, this.f9112e.m(jVar instanceof l ? ((l) jVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f9112e.d());
                }
            }
            if (this.f9114g) {
                if (this.f9113f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f9113f.m(jVar instanceof l ? ((l) jVar).f() : null));
                }
            }
            if (this.f9168d) {
                bigContentTitle.setSummaryText(this.f9167c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0154b.c(bigContentTitle, this.f9116i);
                C0154b.b(bigContentTitle, this.f9115h);
            }
        }

        @Override // androidx.core.app.k.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f9113f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f9114g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f9112e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f9117e;

        @Override // androidx.core.app.k.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.k.f
        public void b(j jVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.f9166b).bigText(this.f9117e);
            if (this.f9168d) {
                bigText.setSummaryText(this.f9167c);
            }
        }

        @Override // androidx.core.app.k.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f9117e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected e f9165a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f9166b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f9167c;

        /* renamed from: d, reason: collision with root package name */
        boolean f9168d = false;

        public void a(Bundle bundle) {
            if (this.f9168d) {
                bundle.putCharSequence("android.summaryText", this.f9167c);
            }
            CharSequence charSequence = this.f9166b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c8 = c();
            if (c8 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c8);
            }
        }

        public abstract void b(j jVar);

        protected abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f9165a != eVar) {
                this.f9165a = eVar;
                if (eVar != null) {
                    eVar.v(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC6243b.f39482b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC6243b.f39481a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class e {

        /* renamed from: A, reason: collision with root package name */
        boolean f9118A;

        /* renamed from: B, reason: collision with root package name */
        boolean f9119B;

        /* renamed from: C, reason: collision with root package name */
        String f9120C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f9121D;

        /* renamed from: E, reason: collision with root package name */
        int f9122E;

        /* renamed from: F, reason: collision with root package name */
        int f9123F;

        /* renamed from: G, reason: collision with root package name */
        Notification f9124G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f9125H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f9126I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f9127J;

        /* renamed from: K, reason: collision with root package name */
        String f9128K;

        /* renamed from: L, reason: collision with root package name */
        int f9129L;

        /* renamed from: M, reason: collision with root package name */
        String f9130M;

        /* renamed from: N, reason: collision with root package name */
        long f9131N;

        /* renamed from: O, reason: collision with root package name */
        int f9132O;

        /* renamed from: P, reason: collision with root package name */
        int f9133P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f9134Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f9135R;

        /* renamed from: S, reason: collision with root package name */
        boolean f9136S;

        /* renamed from: T, reason: collision with root package name */
        Object f9137T;

        /* renamed from: U, reason: collision with root package name */
        public ArrayList f9138U;

        /* renamed from: a, reason: collision with root package name */
        public Context f9139a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f9140b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f9141c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f9142d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f9143e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f9144f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f9145g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f9146h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f9147i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f9148j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f9149k;

        /* renamed from: l, reason: collision with root package name */
        int f9150l;

        /* renamed from: m, reason: collision with root package name */
        int f9151m;

        /* renamed from: n, reason: collision with root package name */
        boolean f9152n;

        /* renamed from: o, reason: collision with root package name */
        boolean f9153o;

        /* renamed from: p, reason: collision with root package name */
        f f9154p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f9155q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f9156r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f9157s;

        /* renamed from: t, reason: collision with root package name */
        int f9158t;

        /* renamed from: u, reason: collision with root package name */
        int f9159u;

        /* renamed from: v, reason: collision with root package name */
        boolean f9160v;

        /* renamed from: w, reason: collision with root package name */
        String f9161w;

        /* renamed from: x, reason: collision with root package name */
        boolean f9162x;

        /* renamed from: y, reason: collision with root package name */
        String f9163y;

        /* renamed from: z, reason: collision with root package name */
        boolean f9164z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i8) {
                return builder.setContentType(i8);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i8) {
                return builder.setUsage(i8);
            }
        }

        public e(Context context, String str) {
            this.f9140b = new ArrayList();
            this.f9141c = new ArrayList();
            this.f9142d = new ArrayList();
            this.f9152n = true;
            this.f9164z = false;
            this.f9122E = 0;
            this.f9123F = 0;
            this.f9129L = 0;
            this.f9132O = 0;
            this.f9133P = 0;
            Notification notification = new Notification();
            this.f9135R = notification;
            this.f9139a = context;
            this.f9128K = str;
            notification.when = System.currentTimeMillis();
            this.f9135R.audioStreamType = -1;
            this.f9151m = 0;
            this.f9138U = new ArrayList();
            this.f9134Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i8, boolean z7) {
            if (z7) {
                Notification notification = this.f9135R;
                notification.flags = i8 | notification.flags;
            } else {
                Notification notification2 = this.f9135R;
                notification2.flags = (~i8) & notification2.flags;
            }
        }

        public e a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f9140b.add(new a(i8, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new l(this).c();
        }

        public Bundle c() {
            if (this.f9121D == null) {
                this.f9121D = new Bundle();
            }
            return this.f9121D;
        }

        public e e(boolean z7) {
            m(16, z7);
            return this;
        }

        public e f(String str) {
            this.f9128K = str;
            return this;
        }

        public e g(int i8) {
            this.f9122E = i8;
            return this;
        }

        public e h(PendingIntent pendingIntent) {
            this.f9145g = pendingIntent;
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f9144f = d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f9143e = d(charSequence);
            return this;
        }

        public e k(int i8) {
            Notification notification = this.f9135R;
            notification.defaults = i8;
            if ((i8 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f9135R.deleteIntent = pendingIntent;
            return this;
        }

        public e n(Bitmap bitmap) {
            this.f9148j = bitmap == null ? null : IconCompat.b(k.b(this.f9139a, bitmap));
            return this;
        }

        public e o(int i8, int i9, int i10) {
            Notification notification = this.f9135R;
            notification.ledARGB = i8;
            notification.ledOnMS = i9;
            notification.ledOffMS = i10;
            notification.flags = ((i9 == 0 || i10 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e p(boolean z7) {
            this.f9164z = z7;
            return this;
        }

        public e q(int i8) {
            this.f9150l = i8;
            return this;
        }

        public e r(int i8) {
            this.f9151m = i8;
            return this;
        }

        public e s(boolean z7) {
            this.f9152n = z7;
            return this;
        }

        public e t(int i8) {
            this.f9135R.icon = i8;
            return this;
        }

        public e u(Uri uri) {
            Notification notification = this.f9135R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d8 = a.d(a.c(a.b(), 4), 5);
            this.f9135R.audioAttributes = a.a(d8);
            return this;
        }

        public e v(f fVar) {
            if (this.f9154p != fVar) {
                this.f9154p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e w(CharSequence charSequence) {
            this.f9135R.tickerText = d(charSequence);
            return this;
        }

        public e x(long[] jArr) {
            this.f9135R.vibrate = jArr;
            return this;
        }

        public e y(int i8) {
            this.f9123F = i8;
            return this;
        }

        public e z(long j8) {
            this.f9135R.when = j8;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
