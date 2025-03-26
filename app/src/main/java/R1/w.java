package r1;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q1.AbstractC6418e;
import q1.AbstractC6419f;
import r1.AbstractC6643a;
import r1.s;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC6643a.b f42424a = new AbstractC6643a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC6643a.b f42426b = new AbstractC6643a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC6643a.e f42428c = new AbstractC6643a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC6643a.c f42430d = new AbstractC6643a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC6643a.f f42432e = new AbstractC6643a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC6643a.f f42434f = new AbstractC6643a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC6643a.f f42436g = new AbstractC6643a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC6643a.f f42437h = new AbstractC6643a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC6643a.f f42438i = new AbstractC6643a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC6643a.f f42439j = new AbstractC6643a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC6643a.c f42440k = new AbstractC6643a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC6643a.c f42441l = new AbstractC6643a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC6643a.c f42442m = new AbstractC6643a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC6643a.c f42443n = new AbstractC6643a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC6643a.c f42444o = new AbstractC6643a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC6643a.c f42445p = new AbstractC6643a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC6643a.b f42446q = new AbstractC6643a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC6643a.b f42447r = new AbstractC6643a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC6643a.c f42448s = new AbstractC6643a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC6643a.f f42449t = new AbstractC6643a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC6643a.c f42450u = new AbstractC6643a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v, reason: collision with root package name */
    public static final AbstractC6643a.b f42451v = new AbstractC6643a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC6643a.b f42452w = new AbstractC6643a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x, reason: collision with root package name */
    public static final AbstractC6643a.f f42453x = new AbstractC6643a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y, reason: collision with root package name */
    public static final AbstractC6643a.f f42454y = new AbstractC6643a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z, reason: collision with root package name */
    public static final AbstractC6643a.f f42455z = new AbstractC6643a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: A, reason: collision with root package name */
    public static final AbstractC6643a.b f42398A = new AbstractC6643a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B, reason: collision with root package name */
    public static final AbstractC6643a.b f42399B = new AbstractC6643a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC6643a.d f42400C = new AbstractC6643a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: D, reason: collision with root package name */
    public static final AbstractC6643a.b f42401D = new AbstractC6643a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E, reason: collision with root package name */
    public static final AbstractC6643a.b f42402E = new AbstractC6643a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F, reason: collision with root package name */
    public static final AbstractC6643a.b f42403F = new AbstractC6643a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G, reason: collision with root package name */
    public static final AbstractC6643a.b f42404G = new AbstractC6643a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H, reason: collision with root package name */
    public static final AbstractC6643a.e f42405H = new AbstractC6643a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I, reason: collision with root package name */
    public static final AbstractC6643a.e f42406I = new AbstractC6643a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J, reason: collision with root package name */
    public static final AbstractC6643a.h f42407J = new AbstractC6643a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K, reason: collision with root package name */
    public static final AbstractC6643a.h f42408K = new AbstractC6643a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L, reason: collision with root package name */
    public static final AbstractC6643a.g f42409L = new AbstractC6643a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M, reason: collision with root package name */
    public static final s.b f42410M = new s.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N, reason: collision with root package name */
    public static final s.a f42411N = new s.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: O, reason: collision with root package name */
    public static final AbstractC6643a.h f42412O = new AbstractC6643a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: P, reason: collision with root package name */
    public static final AbstractC6643a.i f42413P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: Q, reason: collision with root package name */
    public static final AbstractC6643a.d f42414Q = new AbstractC6643a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: R, reason: collision with root package name */
    public static final AbstractC6643a.d f42415R = new AbstractC6643a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: S, reason: collision with root package name */
    public static final AbstractC6643a.h f42416S = new AbstractC6643a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: T, reason: collision with root package name */
    public static final AbstractC6643a.d f42417T = new AbstractC6643a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: U, reason: collision with root package name */
    public static final AbstractC6643a.d f42418U = new AbstractC6643a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: V, reason: collision with root package name */
    public static final AbstractC6643a.d f42419V = new AbstractC6643a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: W, reason: collision with root package name */
    public static final AbstractC6643a.d f42420W = new AbstractC6643a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: X, reason: collision with root package name */
    public static final AbstractC6643a.d f42421X = new AbstractC6643a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Y, reason: collision with root package name */
    public static final AbstractC6643a.d f42422Y = new AbstractC6643a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: Z, reason: collision with root package name */
    public static final AbstractC6643a.d f42423Z = new AbstractC6643a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: a0, reason: collision with root package name */
    public static final AbstractC6643a.d f42425a0 = new AbstractC6643a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: b0, reason: collision with root package name */
    public static final AbstractC6643a.d f42427b0 = new AbstractC6643a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: c0, reason: collision with root package name */
    public static final AbstractC6643a.d f42429c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: d0, reason: collision with root package name */
    public static final AbstractC6643a.d f42431d0 = new AbstractC6643a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: e0, reason: collision with root package name */
    public static final AbstractC6643a.d f42433e0 = new AbstractC6643a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: f0, reason: collision with root package name */
    public static final AbstractC6643a.d f42435f0 = new AbstractC6643a.d("MUTE_AUDIO", "MUTE_AUDIO");

    class a extends AbstractC6643a.i {

        /* renamed from: d, reason: collision with root package name */
        private final Pattern f42456d;

        a(String str, String str2) {
            super(str, str2);
            this.f42456d = Pattern.compile("\\A\\d+");
        }

        @Override // r1.AbstractC6643a
        public boolean d() {
            boolean d8 = super.d();
            if (!d8 || Build.VERSION.SDK_INT >= 29) {
                return d8;
            }
            PackageInfo c8 = AbstractC6418e.c();
            if (c8 == null) {
                return false;
            }
            Matcher matcher = this.f42456d.matcher(c8.versionName);
            return matcher.find() && Integer.parseInt(c8.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    class b extends AbstractC6643a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public boolean d() {
            if (super.d() && AbstractC6419f.a("MULTI_PROCESS")) {
                return AbstractC6418e.h();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, AbstractC6643a.e());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar.a().equals(str)) {
                hashSet.add(pVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((p) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }
}
