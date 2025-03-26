package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OR implements InterfaceC4333v80 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f17884d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a, reason: collision with root package name */
    private final String f17885a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2160b90 f17886b;

    /* renamed from: c, reason: collision with root package name */
    private final RunnableC3464n90 f17887c;

    public OR(String str, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90) {
        this.f17885a = str;
        this.f17887c = runnableC3464n90;
        this.f17886b = interfaceC2160b90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        zzdvy zzdvyVar;
        JSONObject jSONObject;
        String str;
        NR nr = (NR) obj;
        int optInt = nr.f17530a.optInt("http_timeout_millis", 60000);
        C4836zo c4836zo = nr.f17531b;
        String str2 = "";
        if (c4836zo.a() != -2) {
            if (c4836zo.a() == 1) {
                if (c4836zo.h() != null) {
                    str2 = TextUtils.join(", ", c4836zo.h());
                    H2.p.d(str2);
                }
                zzdvyVar = new zzdvy(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzdvyVar = new zzdvy(1);
            }
            RunnableC3464n90 runnableC3464n90 = this.f17887c;
            InterfaceC2160b90 interfaceC2160b90 = this.f17886b;
            interfaceC2160b90.c(zzdvyVar);
            interfaceC2160b90.I0(false);
            runnableC3464n90.a(interfaceC2160b90);
            throw zzdvyVar;
        }
        HashMap hashMap = new HashMap();
        if (nr.f17531b.j() && !TextUtils.isEmpty(this.f17885a)) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23831Z0)).booleanValue()) {
                String str3 = this.f17885a;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = f17884d.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null) {
                            Locale locale = Locale.ROOT;
                            if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("Cookie", str);
                }
            } else {
                hashMap.put("Cookie", this.f17885a);
            }
        }
        if (nr.f17531b.k() && (jSONObject = nr.f17530a) != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                AbstractC0608p0.k("DSID signal does not exist.");
            }
        }
        if (nr.f17531b != null && !TextUtils.isEmpty(nr.f17531b.f())) {
            str2 = nr.f17531b.f();
        }
        RunnableC3464n90 runnableC3464n902 = this.f17887c;
        InterfaceC2160b90 interfaceC2160b902 = this.f17886b;
        interfaceC2160b902.I0(true);
        runnableC3464n902.a(interfaceC2160b902);
        return new IR(nr.f17531b.g(), optInt, hashMap, str2.getBytes(StandardCharsets.UTF_8), "", nr.f17531b.k());
    }
}
