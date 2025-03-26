package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221Da extends AbstractCallableC2524eb {

    /* renamed from: B, reason: collision with root package name */
    private static final C2633fb f14512B = new C2633fb();

    /* renamed from: A, reason: collision with root package name */
    private final C2702g9 f14513A;

    /* renamed from: y, reason: collision with root package name */
    private final C2374d8 f14514y;

    /* renamed from: z, reason: collision with root package name */
    private final Context f14515z;

    public C1221Da(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, Context context, U7 u7, C2374d8 c2374d8, C2702g9 c2702g9) {
        super(c3610oa, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", c2918i8, i8, 27);
        this.f14515z = context;
        this.f14514y = c2374d8;
        this.f14513A = c2702g9;
    }

    private final Z8 d() {
        String str;
        int intValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23737N2)).booleanValue() ? ((Integer) D2.A.c().a(AbstractC3184kf.f23777S2)).intValue() : this.f14514y.b0();
        Z8 z8 = new Z8((String) this.f21841v.invoke(null, this.f14515z, Boolean.FALSE, ""));
        C2702g9 c2702g9 = this.f14513A;
        if (c2702g9 == null || c2702g9.a() == null) {
            str = "E";
        } else {
            try {
                str = (String) c2702g9.a().get(intValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        z8.f20421b = str;
        return z8;
    }

    private final String e() {
        try {
            if (this.f21837o.l() != null) {
                this.f21837o.l().get();
            }
            E8 c8 = this.f21837o.c();
            if (c8 == null || !c8.L0()) {
                return null;
            }
            return c8.a1();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        int i8;
        Z8 z8;
        Z8 z82;
        AtomicReference a8 = f14512B.a(this.f14515z.getPackageName());
        synchronized (a8) {
            try {
                Z8 z83 = (Z8) a8.get();
                if (z83 == null || AbstractC3936ra.d(z83.f20421b) || z83.f20421b.equals("E") || z83.f20421b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (AbstractC3936ra.d(null)) {
                        AbstractC3936ra.d(null);
                        i8 = 3;
                    } else {
                        i8 = 5;
                    }
                    if (this.f14513A != null) {
                        z8 = d();
                    } else {
                        Boolean valueOf = Boolean.valueOf(i8 == 3 && !this.f14514y.e0());
                        Boolean bool = (Boolean) D2.A.c().a(AbstractC3184kf.f23641B2);
                        String c8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23633A2)).booleanValue() ? c() : null;
                        if (bool.booleanValue() && this.f21837o.p() && AbstractC3936ra.d(c8)) {
                            c8 = e();
                        }
                        Z8 z84 = new Z8((String) this.f21841v.invoke(null, this.f14515z, valueOf, c8));
                        if (AbstractC3936ra.d(z84.f20421b) || z84.f20421b.equals("E")) {
                            int i9 = i8 - 1;
                            if (i9 == 3) {
                                String e8 = e();
                                if (!AbstractC3936ra.d(e8)) {
                                    z84.f20421b = e8;
                                }
                            } else if (i9 == 4) {
                                throw null;
                            }
                        }
                        z8 = z84;
                    }
                    a8.set(z8);
                }
                z82 = (Z8) a8.get();
            } finally {
            }
        }
        synchronized (this.f21840u) {
            if (z82 != null) {
                try {
                    this.f21840u.G0(z82.f20421b);
                    this.f21840u.Z(z82.f20422c);
                    this.f21840u.b0(z82.f20423d);
                    this.f21840u.r0(z82.f20424e);
                    this.f21840u.F0(z82.f20425f);
                } finally {
                }
            }
        }
    }

    protected final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] f8 = AbstractC3936ra.f((String) D2.A.c().a(AbstractC3184kf.f23649C2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(f8)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC3936ra.f((String) D2.A.c().a(AbstractC3184kf.f23657D2)))));
            }
            Context context = this.f14515z;
            String packageName = context.getPackageName();
            this.f21837o.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final C4611xk0 D7 = C4611xk0.D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.gb
                public final void onChecksumsReady(List list) {
                    C4611xk0 c4611xk0 = D7;
                    if (list == null) {
                        c4611xk0.e(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ApkChecksum a8 = AbstractC2159b9.a(list.get(i8));
                            if (a8.getType() == 8) {
                                c4611xk0.e(AbstractC3936ra.b(a8.getValue()));
                                return;
                            }
                        }
                        c4611xk0.e(null);
                    } catch (Throwable unused) {
                        c4611xk0.e(null);
                    }
                }
            });
            return (String) D7.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
