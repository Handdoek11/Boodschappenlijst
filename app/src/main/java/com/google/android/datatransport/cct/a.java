package com.google.android.datatransport.cct;

import h2.C5829c;
import j$.util.DesugarCollections;
import j2.InterfaceC6058g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements InterfaceC6058g {

    /* renamed from: c, reason: collision with root package name */
    static final String f13037c;

    /* renamed from: d, reason: collision with root package name */
    static final String f13038d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f13039e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f13040f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f13041g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f13042h;

    /* renamed from: a, reason: collision with root package name */
    private final String f13043a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13044b;

    static {
        String a8 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f13037c = a8;
        String a9 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f13038d = a9;
        String a10 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f13039e = a10;
        f13040f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(C5829c.b("proto"), C5829c.b("json"))));
        f13041g = new a(a8, null);
        f13042h = new a(a9, a10);
    }

    public a(String str, String str2) {
        this.f13043a = str;
        this.f13044b = str2;
    }

    public static a d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // j2.InterfaceC6058g
    public Set a() {
        return f13040f;
    }

    @Override // j2.InterfaceC6057f
    public byte[] b() {
        return c();
    }

    public byte[] c() {
        String str = this.f13044b;
        if (str == null && this.f13043a == null) {
            return null;
        }
        String str2 = this.f13043a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String e() {
        return this.f13044b;
    }

    public String f() {
        return this.f13043a;
    }

    @Override // j2.InterfaceC6057f
    public String getName() {
        return "cct";
    }
}
