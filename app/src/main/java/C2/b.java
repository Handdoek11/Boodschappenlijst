package C2;

import G2.D0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2550eo;
import com.google.android.gms.internal.ads.InterfaceC1426Ip;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f755a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f756b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1426Ip f757c;

    /* renamed from: d, reason: collision with root package name */
    private final C2550eo f758d = new C2550eo(false, Collections.emptyList());

    public b(Context context, InterfaceC1426Ip interfaceC1426Ip, C2550eo c2550eo) {
        this.f755a = context;
        this.f757c = interfaceC1426Ip;
    }

    private final boolean d() {
        InterfaceC1426Ip interfaceC1426Ip = this.f757c;
        return (interfaceC1426Ip != null && interfaceC1426Ip.zza().f15205w) || this.f758d.f21893o;
    }

    public final void a() {
        this.f756b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            InterfaceC1426Ip interfaceC1426Ip = this.f757c;
            if (interfaceC1426Ip != null) {
                interfaceC1426Ip.a(str, null, 3);
                return;
            }
            C2550eo c2550eo = this.f758d;
            if (!c2550eo.f21893o || (list = c2550eo.f21894s) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f755a;
                    v.t();
                    D0.m(context, "", replace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f756b;
    }
}
