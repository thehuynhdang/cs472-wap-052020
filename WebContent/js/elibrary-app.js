/**
 * app.js
 */

 "use strict";

 $(document).ready(function() {

    $("#censusForm").submit(
        function(event) {
            event.preventDefault();
            const fullName = $("#fullName").val();
            const citizenId = $("#citizenId").val();
            const ssn = $("#ssn").val();
            const state = $("#ddlState").val();
            const senior = $("input[name='radioSeniorCitizen']:checked").val();
            let newDataRow = null;
            //let newDataRow = $("#tbodyCitizensList tr:last").clone();
            
            const edittedRowId = $("#editedRowId").val();
            const isEdit = $("#btnSubmit").text() == 'Save';
            if(!edittedRowId) {
                newDataRow = $(`<tr><td class="colCitizenId">${citizenId}</td><td class="colSSN">${ssn}</td><td class="colFullName">${fullName}</td><td class="colState">${state}</td><td class="colSenior">${senior}</td><td class="colRemove btn-outline-danger">Remove</td></tr>`); 
                
                const rowCount = $('#tbodyCitizensList tr').length;
                newDataRow.attr('id',`rowNbr${rowCount}`)
                newDataRow.siblings().removeClass('bg-success');
            } else {
                newDataRow = $("#" + edittedRowId);
            }

            newDataRow.css('display','');
            //newDataRow.removeClass('bg-success').siblings().removeClass('bg-success');

            newDataRow.find('td.colCitizenId').text(citizenId);
            newDataRow.find('td.colSSN').text(ssn);
            newDataRow.find('td.colFullName').text(fullName);
            newDataRow.find('td.colState').text(state);
            newDataRow.find('td.colSenior').text(senior);

            console.log(newDataRow);
            if(!isEdit) {
                $("#tbodyCitizensList").append(newDataRow);
            } 
            // else {
            //     const edittedRowId = $("#editedRowId").val();
            //     $("#" + edittedRowId).replaceWith(newDataRow);
            // }

            newDataRow.click(function() {
                $(this).addClass('bg-success').siblings().removeClass('bg-success');

                $("#fullName").val($(this).find('td.colFullName').text());
                $("#citizenId").val($(this).find('td.colCitizenId').text());
                $("#ssn").val($(this).find('td.colSSN').text());
                $("#ddlState").val($(this).find('td.colState').text());
                $("input[name='radioSeniorCitizen']").val([$(this).find('td.colSenior').text()]);

                $("#fullName").focus();

                $("#editedRowId").val($(this).attr('id'));
                $("#btnSubmit").text("Save");
            });

            newDataRow.children('td.colRemove').click(function() {
                newDataRow.remove();
            });

            $("#fullName").val("");
            $("#citizenId").val("");
            $("#ssn").val("");
            $("#ddlState").val("");
            $("#editedRowId").val("");
            //$("#radioradioSeniorCitizenYes").prop("checked", false);
            //$("#radioradioSeniorCitizenNo").prop("checked", false);
            $("input[name='radioSeniorCitizen']").val([]);
            $("#fullName").focus();
            $("#btnSubmit").text("Submit");

        }
    );

    $('#tbodyCitizensList tr td.colRemove').each(function(){
        $(this).click(function() {
            alert(this);
        });
    });
 });