package C3;

import B3.InterfaceC0382a;
import X2.InterfaceC0755c;
import Z2.AbstractC0765d;
import Z2.AbstractC0769h;
import Z2.C0766e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.internal.wearable.AbstractC5270t;
import com.google.android.gms.internal.wearable.InterfaceC5265q;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class Z1 extends AbstractC0769h {

    /* renamed from: I, reason: collision with root package name */
    private final ExecutorService f923I;

    /* renamed from: J, reason: collision with root package name */
    private final C0427g1 f924J;

    /* renamed from: K, reason: collision with root package name */
    private final C0427g1 f925K;

    /* renamed from: L, reason: collision with root package name */
    private final C0427g1 f926L;

    /* renamed from: M, reason: collision with root package name */
    private final C0427g1 f927M;

    /* renamed from: N, reason: collision with root package name */
    private final C0427g1 f928N;

    /* renamed from: O, reason: collision with root package name */
    private final C0427g1 f929O;

    /* renamed from: P, reason: collision with root package name */
    private final C0427g1 f930P;

    /* renamed from: Q, reason: collision with root package name */
    private final C0427g1 f931Q;

    /* renamed from: R, reason: collision with root package name */
    private final C0427g1 f932R;

    /* renamed from: S, reason: collision with root package name */
    private final C0427g1 f933S;

    /* renamed from: T, reason: collision with root package name */
    private final h2 f934T;

    /* renamed from: U, reason: collision with root package name */
    private final InterfaceC5265q f935U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(final Context context, Looper looper, c.a aVar, c.b bVar, C0766e c0766e) {
        super(context, looper, 14, c0766e, aVar, bVar);
        com.google.android.gms.internal.wearable.x1.a();
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        h2 a8 = h2.a(context);
        this.f924J = new C0427g1();
        this.f925K = new C0427g1();
        this.f926L = new C0427g1();
        this.f927M = new C0427g1();
        this.f928N = new C0427g1();
        this.f929O = new C0427g1();
        this.f930P = new C0427g1();
        this.f931Q = new C0427g1();
        this.f932R = new C0427g1();
        this.f933S = new C0427g1();
        new C0427g1();
        new C0427g1();
        this.f923I = (ExecutorService) Z2.r.l(unconfigurableExecutorService);
        this.f934T = a8;
        this.f935U = AbstractC5270t.a(new InterfaceC5265q() { // from class: C3.X1
            @Override // com.google.android.gms.internal.wearable.InterfaceC5265q
            public final Object zza() {
                File file = new File(com.google.android.gms.internal.wearable.o1.a(com.google.android.gms.internal.wearable.n1.a(), new File(com.google.android.gms.internal.wearable.o1.a(com.google.android.gms.internal.wearable.n1.a(), context.getFilesDir(), "wearos_assets")), "streamtmp"));
                file.mkdirs();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                return file;
            }
        });
    }

    @Override // Z2.AbstractC0765d
    protected final String E() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // Z2.AbstractC0765d
    protected final String F() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // Z2.AbstractC0765d
    protected final String G() {
        return this.f934T.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // Z2.AbstractC0765d
    protected final void N(int i8, IBinder iBinder, Bundle bundle, int i9) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i8);
        }
        if (i8 == 0) {
            this.f924J.b(iBinder);
            this.f925K.b(iBinder);
            this.f926L.b(iBinder);
            this.f928N.b(iBinder);
            this.f929O.b(iBinder);
            this.f930P.b(iBinder);
            this.f931Q.b(iBinder);
            this.f932R.b(iBinder);
            this.f933S.b(iBinder);
            this.f927M.b(iBinder);
            i8 = 0;
        }
        super.N(i8, iBinder, bundle, i9);
    }

    @Override // Z2.AbstractC0765d
    public final boolean S() {
        return true;
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final boolean i() {
        return !this.f934T.b();
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 8600000;
    }

    @Override // Z2.AbstractC0765d, com.google.android.gms.common.api.a.f
    public final void l(AbstractC0765d.c cVar) {
        if (!i()) {
            try {
                Bundle bundle = y().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i8 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i8 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i8);
                    Context y7 = y();
                    Context y8 = y();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (y8.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    R(cVar, 6, PendingIntent.getActivity(y7, 0, intent, com.google.android.gms.internal.wearable.t1.f30227a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                R(cVar, 16, null);
                return;
            }
        }
        super.l(cVar);
    }

    public final void l0(InterfaceC0755c interfaceC0755c, InterfaceC0382a.InterfaceC0007a interfaceC0007a, C1092d c1092d, IntentFilter[] intentFilterArr) {
        this.f933S.a(this, interfaceC0755c, interfaceC0007a, g2.D0(c1092d, intentFilterArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0(X2.InterfaceC0755c r17, B3.C0401u r18) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.Z1.m0(X2.c, B3.u):void");
    }

    public final void n0(InterfaceC0755c interfaceC0755c, InterfaceC0382a.InterfaceC0007a interfaceC0007a) {
        this.f933S.c(this, interfaceC0755c, interfaceC0007a);
    }

    @Override // Z2.AbstractC0765d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof C0415c1 ? (C0415c1) queryLocalInterface : new C0415c1(iBinder);
    }

    @Override // Z2.AbstractC0765d
    public final C1105d[] v() {
        return B3.O.f414D;
    }
}
