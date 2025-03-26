package com.adadapted.android.sdk.core.deeplink;

import J6.AbstractC0650j;
import J6.H;
import J6.r;
import S6.d;
import android.net.Uri;
import android.util.Base64;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.atl.AddItContentParser;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.payload.Payload;
import g7.b;
import g7.j;
import java.util.HashMap;
import l7.a;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class DeeplinkContentParser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String NO_DEEPLINK_URL = "Did not receive a deeplink url.";
    private static final String PAYLOAD_PARSE_ERROR = "Problem parsing content payload.";

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        private Companion() {
        }
    }

    public final AdditContent parse(Uri uri) {
        if (uri == null) {
            EventClient.trackSdkError$default(EventClient.INSTANCE, EventStrings.ADDIT_NO_DEEPLINK_RECEIVED, "Did not receive a deeplink url.", null, 4, null);
            throw new Exception("Did not receive a deeplink url.");
        }
        String queryParameter = uri.getQueryParameter("data");
        byte[] decode = Base64.decode(queryParameter, 0);
        r.b(decode);
        String str = new String(decode, 0, decode.length, d.f5130b);
        try {
            a.C0286a c0286a = a.f38819d;
            b c8 = j.c(c0286a.a(), H.i(Payload.class));
            r.c(c8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return AddItContentParser.INSTANCE.generateAddItContentFromDeeplink((Payload) c0286a.c(c8, str));
        } catch (JSONException e8) {
            HashMap hashMap = new HashMap();
            hashMap.put(AdditContent.AdditSources.PAYLOAD, "{\"raw\":\"" + queryParameter + "\", \"parsed\":\"" + str + "\"}");
            String message = e8.getMessage();
            if (message != null) {
            }
            EventClient.INSTANCE.trackSdkError(EventStrings.ADDIT_PAYLOAD_PARSE_FAILED, "Problem parsing Deeplink JSON input", hashMap);
            throw new Exception(PAYLOAD_PARSE_ERROR);
        }
    }
}
