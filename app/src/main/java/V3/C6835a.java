package v3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;
import java.util.List;
import java.util.Map;
import w3.t;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6835a {

    /* renamed from: a, reason: collision with root package name */
    private final C4889d1 f44084a;

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0339a extends t {
    }

    public C6835a(C4889d1 c4889d1) {
        this.f44084a = c4889d1;
    }

    public static C6835a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return C4889d1.g(context, str, str2, str3, bundle).y();
    }

    public void a(String str) {
        this.f44084a.A(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f44084a.s(str, str2, bundle);
    }

    public void c(String str) {
        this.f44084a.E(str);
    }

    public long d() {
        return this.f44084a.b();
    }

    public String e() {
        return this.f44084a.H();
    }

    public String f() {
        return this.f44084a.J();
    }

    public List g(String str, String str2) {
        return this.f44084a.h(str, str2);
    }

    public String h() {
        return this.f44084a.K();
    }

    public String i() {
        return this.f44084a.L();
    }

    public String j() {
        return this.f44084a.M();
    }

    public int l(String str) {
        return this.f44084a.a(str);
    }

    public Map m(String str, String str2, boolean z7) {
        return this.f44084a.i(str, str2, z7);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f44084a.C(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f44084a.c(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f44084a.c(bundle, true);
    }

    public void q(InterfaceC0339a interfaceC0339a) {
        this.f44084a.v(interfaceC0339a);
    }

    public void r(Bundle bundle) {
        this.f44084a.l(bundle);
    }

    public void s(Bundle bundle) {
        this.f44084a.z(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.f44084a.k(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.f44084a.u(str, str2, obj, true);
    }
}
