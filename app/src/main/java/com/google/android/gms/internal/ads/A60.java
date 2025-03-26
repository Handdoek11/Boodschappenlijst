package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A60 {

    /* renamed from: a, reason: collision with root package name */
    public final List f13519a;

    /* renamed from: b, reason: collision with root package name */
    public final C4111t60 f13520b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13521c;

    /* renamed from: d, reason: collision with root package name */
    public final C4618xo f13522d;

    A60(JsonReader jsonReader, C4618xo c4618xo) {
        Bundle bundle;
        Bundle bundle2;
        this.f13522d = c4618xo;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue() && c4618xo != null && (bundle2 = c4618xo.f27914D) != null) {
            bundle2.putLong(EnumC3706pN.SERVER_RESPONSE_PARSE_START.a(), C2.v.c().a());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        C4111t60 c4111t60 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new C3785q60(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        c4111t60 = new C4111t60(jsonReader);
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23940l2)).booleanValue() && c4618xo != null && (bundle = c4618xo.f27914D) != null) {
                            bundle.putLong(EnumC3706pN.NORMALIZATION_AD_RESPONSE_START.a(), c4111t60.f26849s);
                            c4618xo.f27914D.putLong(EnumC3706pN.NORMALIZATION_AD_RESPONSE_END.a(), c4111t60.f26850t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = G2.U.i(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new C4765z60(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f13521c = arrayList;
        this.f13519a = emptyList;
        this.f13520b = c4111t60 == null ? new C4111t60(new JsonReader(new StringReader("{}"))) : c4111t60;
    }

    public static A60 a(Reader reader, C4618xo c4618xo) {
        try {
            try {
                return new A60(new JsonReader(reader), c4618xo);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e8) {
                throw new zzfbs("unable to parse ServerResponse", e8);
            }
        } finally {
            f3.k.a(reader);
        }
    }
}
