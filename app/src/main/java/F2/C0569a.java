package F2;

import G2.AbstractC0608p0;
import G2.D0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.HN;

/* renamed from: F2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569a {
    public static final boolean a(Context context, Intent intent, InterfaceC0572d interfaceC0572d, InterfaceC0570b interfaceC0570b, boolean z7, HN hn, String str) {
        if (z7) {
            return c(context, intent.getData(), interfaceC0572d, interfaceC0570b);
        }
        try {
            AbstractC0608p0.k("Launching an intent: " + intent.toURI());
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Vc)).booleanValue()) {
                C2.v.t();
                D0.x(context, intent, hn, str);
            } else {
                C2.v.t();
                D0.t(context, intent);
            }
            if (interfaceC0572d != null) {
                interfaceC0572d.g();
            }
            if (interfaceC0570b != null) {
                interfaceC0570b.B(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            H2.p.g(e8.getMessage());
            if (interfaceC0570b != null) {
                interfaceC0570b.B(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, l lVar, InterfaceC0572d interfaceC0572d, InterfaceC0570b interfaceC0570b, HN hn, String str) {
        int i8 = 0;
        if (lVar == null) {
            H2.p.g("No intent data for launcher overlay.");
            return false;
        }
        AbstractC3184kf.a(context);
        Intent intent = lVar.f2267y;
        if (intent != null) {
            return a(context, intent, interfaceC0572d, interfaceC0570b, lVar.f2259A, hn, str);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(lVar.f2261s)) {
            H2.p.g("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(lVar.f2262t)) {
            intent2.setData(Uri.parse(lVar.f2261s));
        } else {
            String str2 = lVar.f2261s;
            intent2.setDataAndType(Uri.parse(str2), lVar.f2262t);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(lVar.f2263u)) {
            intent2.setPackage(lVar.f2263u);
        }
        if (!TextUtils.isEmpty(lVar.f2264v)) {
            String[] split = lVar.f2264v.split("/", 2);
            if (split.length < 2) {
                H2.p.g("Could not parse component name from open GMSG: ".concat(String.valueOf(lVar.f2264v)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str3 = lVar.f2265w;
        if (!TextUtils.isEmpty(str3)) {
            try {
                i8 = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                H2.p.g("Could not parse intent flags.");
            }
            intent2.addFlags(i8);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23659D4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23651C4)).booleanValue()) {
                C2.v.t();
                D0.U(context, intent2);
            }
        }
        return a(context, intent2, interfaceC0572d, interfaceC0570b, lVar.f2259A, hn, str);
    }

    private static final boolean c(Context context, Uri uri, InterfaceC0572d interfaceC0572d, InterfaceC0570b interfaceC0570b) {
        int i8;
        try {
            i8 = C2.v.t().S(context, uri);
            if (interfaceC0572d != null) {
                interfaceC0572d.g();
            }
        } catch (ActivityNotFoundException e8) {
            H2.p.g(e8.getMessage());
            i8 = 6;
        }
        if (interfaceC0570b != null) {
            interfaceC0570b.A(i8);
        }
        return i8 == 5;
    }
}
