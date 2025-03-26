package m7;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: classes2.dex */
public abstract class u {
    public static final JsonDecodingException a(Number number, String str, String str2) {
        J6.r.e(number, "value");
        J6.r.e(str, "key");
        J6.r.e(str2, "output");
        return d(-1, j(number, str, str2));
    }

    public static final JsonEncodingException b(Number number, String str) {
        J6.r.e(number, "value");
        J6.r.e(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(str, 0, 1, null)));
    }

    public static final JsonEncodingException c(i7.f fVar) {
        J6.r.e(fVar, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + fVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException d(int i8, String str) {
        J6.r.e(str, "message");
        if (i8 >= 0) {
            str = "Unexpected JSON token at offset " + i8 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException e(int i8, String str, CharSequence charSequence) {
        J6.r.e(str, "message");
        J6.r.e(charSequence, "input");
        return d(i8, str + "\nJSON input: " + ((Object) g(charSequence, i8)));
    }

    public static final JsonDecodingException f(String str, String str2) {
        J6.r.e(str, "key");
        J6.r.e(str2, "input");
        return d(-1, "Encountered unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) h(str2, 0, 1, null)));
    }

    private static final CharSequence g(CharSequence charSequence, int i8) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i8 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i9 = i8 - 30;
        int i10 = i8 + 30;
        return (i9 <= 0 ? "" : ".....") + charSequence.subSequence(P6.m.c(i9, 0), P6.m.e(i10, charSequence.length())).toString() + (i10 >= charSequence.length() ? "" : ".....");
    }

    static /* synthetic */ CharSequence h(CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -1;
        }
        return g(charSequence, i8);
    }

    public static final Void i(AbstractC6227a abstractC6227a, Number number) {
        J6.r.e(abstractC6227a, "<this>");
        J6.r.e(number, "result");
        AbstractC6227a.y(abstractC6227a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String j(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(str2, 0, 1, null));
    }
}
