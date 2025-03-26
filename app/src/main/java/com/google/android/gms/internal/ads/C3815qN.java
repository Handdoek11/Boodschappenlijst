package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3815qN {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC4169th0 f25905d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC4169th0 f25906e;

    /* renamed from: a, reason: collision with root package name */
    private final String f25907a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3706pN f25908b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3706pN f25909c;

    static {
        EnumC3706pN enumC3706pN = EnumC3706pN.PUBLIC_API_CALL;
        EnumC3706pN enumC3706pN2 = EnumC3706pN.PUBLIC_API_CALLBACK;
        C3815qN c3815qN = new C3815qN("tqgt", enumC3706pN, enumC3706pN2);
        EnumC3706pN enumC3706pN3 = EnumC3706pN.DYNAMITE_ENTER;
        C3815qN c3815qN2 = new C3815qN("l.dl", enumC3706pN, enumC3706pN3);
        EnumC3706pN enumC3706pN4 = EnumC3706pN.READ_FROM_DISK_START;
        C3815qN c3815qN3 = new C3815qN("l.rccde", enumC3706pN3, enumC3706pN4);
        C3815qN c3815qN4 = new C3815qN("l.rfd", enumC3706pN4, EnumC3706pN.READ_FROM_DISK_END);
        EnumC3706pN enumC3706pN5 = EnumC3706pN.CLIENT_SIGNALS_START;
        C3815qN c3815qN5 = new C3815qN("l.rcc", enumC3706pN3, enumC3706pN5);
        EnumC3706pN enumC3706pN6 = EnumC3706pN.CLIENT_SIGNALS_END;
        C3815qN c3815qN6 = new C3815qN("l.cs", enumC3706pN5, enumC3706pN6);
        EnumC3706pN enumC3706pN7 = EnumC3706pN.SERVICE_CONNECTED;
        C3815qN c3815qN7 = new C3815qN("l.cts", enumC3706pN6, enumC3706pN7);
        EnumC3706pN enumC3706pN8 = EnumC3706pN.GMS_SIGNALS_START;
        EnumC3706pN enumC3706pN9 = EnumC3706pN.GMS_SIGNALS_END;
        C3815qN c3815qN8 = new C3815qN("l.gs", enumC3706pN8, enumC3706pN9);
        EnumC3706pN enumC3706pN10 = EnumC3706pN.GET_SIGNALS_SDKCORE_START;
        C3815qN c3815qN9 = new C3815qN("l.jse", enumC3706pN9, enumC3706pN10);
        EnumC3706pN enumC3706pN11 = EnumC3706pN.GET_SIGNALS_SDKCORE_END;
        C3815qN c3815qN10 = new C3815qN("l.gs-sdkcore", enumC3706pN10, enumC3706pN11);
        C3815qN c3815qN11 = new C3815qN("l.gs-pp", enumC3706pN11, enumC3706pN2);
        EnumC3706pN enumC3706pN12 = EnumC3706pN.RENDERING_START;
        C3815qN c3815qN12 = new C3815qN("l.render", enumC3706pN12, enumC3706pN2);
        EnumC3706pN enumC3706pN13 = EnumC3706pN.RENDERING_WEBVIEW_CREATION_START;
        C3815qN c3815qN13 = new C3815qN("l.render.pre", enumC3706pN12, enumC3706pN13);
        EnumC3706pN enumC3706pN14 = EnumC3706pN.RENDERING_WEBVIEW_CREATION_END;
        C3815qN c3815qN14 = new C3815qN("l.render.wvc", enumC3706pN13, enumC3706pN14);
        EnumC3706pN enumC3706pN15 = EnumC3706pN.RENDERING_AD_COMPONENT_CREATION_END;
        C3815qN c3815qN15 = new C3815qN("l.render.acc", enumC3706pN14, enumC3706pN15);
        EnumC3706pN enumC3706pN16 = EnumC3706pN.RENDERING_CONFIGURE_WEBVIEW_START;
        EnumC3706pN enumC3706pN17 = EnumC3706pN.RENDERING_CONFIGURE_WEBVIEW_END;
        C3815qN c3815qN16 = new C3815qN("l.render.cfg-wv", enumC3706pN16, enumC3706pN17);
        EnumC3706pN enumC3706pN18 = EnumC3706pN.RENDERING_WEBVIEW_LOAD_HTML_START;
        EnumC3706pN enumC3706pN19 = EnumC3706pN.RENDERING_WEBVIEW_LOAD_HTML_END;
        f25905d = AbstractC4169th0.I(c3815qN, c3815qN2, c3815qN3, c3815qN4, c3815qN5, c3815qN6, c3815qN7, c3815qN8, c3815qN9, c3815qN10, c3815qN11, c3815qN12, c3815qN13, c3815qN14, c3815qN15, c3815qN16, new C3815qN("l.render.wvlh", enumC3706pN18, enumC3706pN19), new C3815qN("l.render.post", enumC3706pN19, enumC3706pN2), new C3815qN("l.sodv", EnumC3706pN.SIGNAL_ON_DISK_VALIDATION_START, EnumC3706pN.SIGNAL_ON_DISK_VALIDATION_END), new C3815qN("l.sodck", EnumC3706pN.SIGNAL_ON_DISK_CACHE_KEY_START, EnumC3706pN.SIGNAL_ON_DISK_CACHE_KEY_END), new C3815qN("l.sodrar", EnumC3706pN.SIGNAL_ON_DISK_READ_AND_REMOVE_START, EnumC3706pN.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new C3815qN("l.soddc", EnumC3706pN.SIGNAL_ON_DISK_DECODE_START, EnumC3706pN.SIGNAL_ON_DISK_DECODE_END));
        C3815qN c3815qN17 = new C3815qN("l.al", enumC3706pN, enumC3706pN2);
        C3815qN c3815qN18 = new C3815qN("l.al2", enumC3706pN3, enumC3706pN2);
        C3815qN c3815qN19 = new C3815qN("l.dl", enumC3706pN, enumC3706pN3);
        C3815qN c3815qN20 = new C3815qN("l.rcc", enumC3706pN3, enumC3706pN5);
        C3815qN c3815qN21 = new C3815qN("l.cs", enumC3706pN5, enumC3706pN6);
        C3815qN c3815qN22 = new C3815qN("l.cts", enumC3706pN6, enumC3706pN7);
        C3815qN c3815qN23 = new C3815qN("l.gs", enumC3706pN8, enumC3706pN9);
        EnumC3706pN enumC3706pN20 = EnumC3706pN.GET_AD_DICTIONARY_SDKCORE_START;
        C3815qN c3815qN24 = new C3815qN("l.jse", enumC3706pN9, enumC3706pN20);
        EnumC3706pN enumC3706pN21 = EnumC3706pN.GET_AD_DICTIONARY_SDKCORE_END;
        C3815qN c3815qN25 = new C3815qN("l.gad-js", enumC3706pN20, enumC3706pN21);
        EnumC3706pN enumC3706pN22 = EnumC3706pN.HTTP_RESPONSE_READY;
        C3815qN c3815qN26 = new C3815qN("l.http", enumC3706pN21, enumC3706pN22);
        EnumC3706pN enumC3706pN23 = EnumC3706pN.NORMALIZATION_AD_RESPONSE_START;
        C3815qN c3815qN27 = new C3815qN("l.jse-nml", enumC3706pN22, enumC3706pN23);
        EnumC3706pN enumC3706pN24 = EnumC3706pN.NORMALIZATION_AD_RESPONSE_END;
        C3815qN c3815qN28 = new C3815qN("l.nml-js", enumC3706pN23, enumC3706pN24);
        EnumC3706pN enumC3706pN25 = EnumC3706pN.BINDER_CALL_START;
        C3815qN c3815qN29 = new C3815qN("l.nml-gmsg", enumC3706pN24, enumC3706pN25);
        EnumC3706pN enumC3706pN26 = EnumC3706pN.SERVER_RESPONSE_PARSE_START;
        f25906e = AbstractC4169th0.I(c3815qN17, c3815qN18, c3815qN19, c3815qN20, c3815qN21, c3815qN22, c3815qN23, c3815qN24, c3815qN25, c3815qN26, c3815qN27, c3815qN28, c3815qN29, new C3815qN("l.binder", enumC3706pN25, enumC3706pN26), new C3815qN("l.sr", enumC3706pN26, enumC3706pN12), new C3815qN("l.render", enumC3706pN12, enumC3706pN2), new C3815qN("l.t2", EnumC3706pN.RENDERING_ADSTRING_TYPE2_FETCH_START, EnumC3706pN.RENDERING_ADSTRING_TYPE2_FETCH_END), new C3815qN("l.render.wvc", enumC3706pN13, enumC3706pN14), new C3815qN("l.render.acc", enumC3706pN14, enumC3706pN15), new C3815qN("l.render.cfg-wv", enumC3706pN16, enumC3706pN17), new C3815qN("l.render.pre", enumC3706pN12, enumC3706pN13), new C3815qN("l.render.post", enumC3706pN19, enumC3706pN2), new C3815qN("l.render.wvlh", enumC3706pN18, enumC3706pN19));
    }

    public C3815qN(String str, EnumC3706pN enumC3706pN, EnumC3706pN enumC3706pN2) {
        this.f25907a = str;
        this.f25908b = enumC3706pN;
        this.f25909c = enumC3706pN2;
    }

    public final EnumC3706pN a() {
        return this.f25908b;
    }

    public final EnumC3706pN b() {
        return this.f25909c;
    }

    public final String c() {
        return this.f25907a;
    }
}
