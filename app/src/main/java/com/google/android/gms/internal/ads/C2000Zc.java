package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000Zc {

    /* renamed from: a, reason: collision with root package name */
    private final C2637fd f20510a;

    /* renamed from: b, reason: collision with root package name */
    private final C1409Ie f20511b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20512c;

    private C2000Zc() {
        this.f20511b = C1445Je.v0();
        this.f20512c = false;
        this.f20510a = new C2637fd();
    }

    public static C2000Zc a() {
        return new C2000Zc();
    }

    private final synchronized String d(int i8) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f20511b.I(), Long.valueOf(C2.v.c().b()), Integer.valueOf(i8 - 1), Base64.encodeToString(((C1445Je) this.f20511b.x()).m(), 3));
    }

    private final synchronized void e(int i8) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(AbstractC1228Dd0.a(AbstractC1192Cd0.a(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(d(i8).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        AbstractC0608p0.k("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                AbstractC0608p0.k("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    AbstractC0608p0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            AbstractC0608p0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i8) {
        C1409Ie c1409Ie = this.f20511b;
        c1409Ie.M();
        c1409Ie.L(G2.D0.I());
        C2420dd c2420dd = new C2420dd(this.f20510a, ((C1445Je) this.f20511b.x()).m(), null);
        int i9 = i8 - 1;
        c2420dd.a(i9);
        c2420dd.c();
        AbstractC0608p0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i9, 10))));
    }

    public final synchronized void b(InterfaceC1965Yc interfaceC1965Yc) {
        if (this.f20512c) {
            try {
                interfaceC1965Yc.a(this.f20511b);
            } catch (NullPointerException e8) {
                C2.v.s().x(e8, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i8) {
        if (this.f20512c) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23819X4)).booleanValue()) {
                e(i8);
            } else {
                f(i8);
            }
        }
    }

    public C2000Zc(C2637fd c2637fd) {
        this.f20511b = C1445Je.v0();
        this.f20510a = c2637fd;
        this.f20512c = ((Boolean) D2.A.c().a(AbstractC3184kf.f23811W4)).booleanValue();
    }
}
